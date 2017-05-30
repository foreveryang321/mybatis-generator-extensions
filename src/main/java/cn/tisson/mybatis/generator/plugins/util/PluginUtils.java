package cn.tisson.mybatis.generator.plugins.util;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.config.Context;

public class PluginUtils {

    /**
     * 为类添加field，并生成getter、setter方法
     * 
     * @param clazz 类名
     * @param table 表明
     * @param name field名称
     * @param basic 是否使用基础数据类型（int、boolean），否则使用封装类型（Integer、Boolean）
     * @param getter 是否生成getter方法
     * @param setter 是否生成settter方法
     * @author YL 2017年5月30日
     */
    public static void createField(TopLevelClass clazz, String name, boolean basic, boolean getter,
            boolean setter) {
        FullyQualifiedJavaType intInstance = null;
        if (basic) {
            intInstance = FullyQualifiedJavaType.getIntInstance();
        } else {
            intInstance = FullyQualifiedJavaType.getIntInstance().getPrimitiveTypeWrapper();
        }
        // 生成类属性
        Field field = new Field();
        field.setVisibility(JavaVisibility.PROTECTED);
        field.setType(intInstance);
        field.setName(name);
        clazz.addField(field);

        String camel = "";
        if (getter || setter) {
            char c = name.charAt(0);
            camel = Character.toUpperCase(c) + name.substring(1);
        }
        if (getter) {
            // 生成getter方法
            Method method = new Method();
            method.setVisibility(JavaVisibility.PUBLIC);
            method.setReturnType(intInstance);
            method.setName("get" + camel);
            method.addBodyLine("return " + name + ";");
            clazz.addMethod(method);
        }
        if (setter) {
            // 生成setter方法
            Method method = new Method();
            method.setVisibility(JavaVisibility.PUBLIC);
            method.setName("set" + camel);
            method.addParameter(new Parameter(intInstance, name));
            method.addBodyLine("this." + name + " = " + name + ";");
            clazz.addMethod(method);
        }
    }

    /**
     * 生成toString方法
     * 
     * @param context 当前上下文
     * @param clazz 类名
     * @param table 表名
     * @param useToStringFromRoot
     * @author YL 2017年5月30日
     */
    public static void createToStringMethod(Context context, TopLevelClass clazz,
            IntrospectedTable table, boolean useToStringFromRoot) {
        Method method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.setReturnType(FullyQualifiedJavaType.getStringInstance());
        method.setName("toString");
        if (table.isJava5Targeted()) {
            method.addAnnotation("@Override");
        }
        context.getCommentGenerator().addGeneralMethodComment(method, table);

        method.addBodyLine("StringBuilder sb = new StringBuilder();");
        method.addBodyLine("sb.append(this.getClass().getSimpleName());");
        method.addBodyLine("sb.append(\" [\");");
        StringBuilder sb = new StringBuilder();
        String sp = "";
        for (Field field : clazz.getFields()) {
            String property = field.getName();
            if ("serialVersionUID".equals(property)) {
                continue;
            }
            sb.setLength(0);
            sb.append("sb.append(\"").append(sp).append(property).append("=\")").append(".append(")
                    .append(property).append(");");
            method.addBodyLine(sb.toString());
            sp = ", ";
        }
        method.addBodyLine("sb.append(\"]\");");
        if (useToStringFromRoot && clazz.getSuperClass() != null) {
            method.addBodyLine("sb.append(\", from super class \");");
            method.addBodyLine("sb.append(super.toString());");
        }
        method.addBodyLine("return sb.toString();");
        clazz.addMethod(method);
    }
}
