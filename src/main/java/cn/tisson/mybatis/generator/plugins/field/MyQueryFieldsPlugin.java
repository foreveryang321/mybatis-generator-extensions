package cn.tisson.mybatis.generator.plugins.field;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.PrimitiveTypeWrapper;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.Element;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.List;

/**
 * 自定义查询字段插件：比如一个表有10个字段，我们只配置查询其中的id，则其他字段全部返回null，这个可以减少实体类占用内存的大小
 *
 * @author Created by yl on 2017/05/28.
 */
public class MyQueryFieldsPlugin extends PluginAdapter {

    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean modelExampleClassGenerated(TopLevelClass clazz, IntrospectedTable table) {
        // add field, getter, setter for limit clause
        addfields(clazz, table, "fields");
        return super.modelExampleClassGenerated(clazz, table);
    }

    @Override
    public boolean sqlMapBaseColumnListElementGenerated(XmlElement element, IntrospectedTable table) {
        XmlElement isNullElement = new XmlElement("if"); //$NON-NLS-1$
        isNullElement.addAttribute(new Attribute("test", "fields == null")); //$NON-NLS-1$ //$NON-NLS-2$
        // isNotNullElement.addAttribute(new Attribute("compareValue", "0")); //$NON-NLS-1$
        // //$NON-NLS-2$
        for (Element e : element.getElements()) {
            isNullElement.addElement(e);
        }
        element.getElements().clear();
        element.addElement(isNullElement);

        XmlElement isNotNullElement = new XmlElement("if"); //$NON-NLS-1$
        isNotNullElement.addAttribute(new Attribute("test", "fields != null")); //$NON-NLS-1$ //$NON-NLS-2$
        // isNotNullElement.addAttribute(new Attribute("compareValue", "0")); //$NON-NLS-1$
        // //$NON-NLS-2$
        isNotNullElement.addElement(new TextElement("${fields}"));
        // isParameterPresenteElemen.addElement(isNotNullElement);
        element.addElement(isNotNullElement);
        return super.sqlMapBaseColumnListElementGenerated(element, table);
    }

    @Override
    public boolean sqlMapSelectByPrimaryKeyElementGenerated(XmlElement element,
                                                            IntrospectedTable introspectedTable) {
        List<Element> elements = element.getElements();
        StringBuilder columns = new StringBuilder();
        List<IntrospectedColumn> allColumns = introspectedTable.getAllColumns();
        for (IntrospectedColumn introspectedColumn : allColumns) {
            columns.append(",").append(introspectedColumn.getActualColumnName());
        }
        columns.deleteCharAt(0);
        elements.set(1, new TextElement(columns.toString()));
        return super.sqlMapSelectByPrimaryKeyElementGenerated(element, introspectedTable);
    }

    private void addfields(TopLevelClass clazz, IntrospectedTable table, String name) {
        CommentGenerator commentGenerator = context.getCommentGenerator();
        Field field = new Field();
        field.setVisibility(JavaVisibility.PROTECTED);
        // field.setType(FullyQualifiedJavaType.getIntInstance());
        field.setType(PrimitiveTypeWrapper.getStringInstance());
        field.setName(name);
        // field.setInitializationString("1");
        commentGenerator.addFieldComment(field, table);
        clazz.addField(field);
        char c = name.charAt(0);
        String camel = Character.toUpperCase(c) + name.substring(1);
        Method method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setName("set" + camel);
        method.addParameter(new Parameter(PrimitiveTypeWrapper.getStringInstance(), name));
        method.addBodyLine("this." + name + "=" + name + ";");
        commentGenerator.addGeneralMethodComment(method, table);
        clazz.addMethod(method);
        method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(PrimitiveTypeWrapper.getStringInstance());
        method.setName("get" + camel);
        method.addBodyLine("return " + name + ";");
        commentGenerator.addGeneralMethodComment(method, table);
        clazz.addMethod(method);
    }
}
