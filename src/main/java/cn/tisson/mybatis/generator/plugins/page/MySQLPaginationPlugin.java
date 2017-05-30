package cn.tisson.mybatis.generator.plugins.page;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

import cn.tisson.mybatis.generator.plugins.util.PluginUtils;

/**
 * MySQL分页插件
 *
 * @author Created by yl on 2017/05/28.
 */
public class MySQLPaginationPlugin extends PluginAdapter {

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    /**
     * 为每个Example类添加limit和offset属性和set、get方法
     */
    @Override
    public boolean modelExampleClassGenerated(TopLevelClass clazz, IntrospectedTable table) {
        PluginUtils.createField(clazz, "limit", false, true, true);
        PluginUtils.createField(clazz, "offset", false, true, true);
        return true;
    }

    /**
     * 为Mapper.xml的selectByExample添加limit,offset
     */
    @Override
    public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(XmlElement ele,
            IntrospectedTable table) {
        XmlElement ifLimitNotNullElement = new XmlElement("if");
        ifLimitNotNullElement.addAttribute(new Attribute("test", "limit != null"));

        XmlElement ifOffsetNotNullElement = new XmlElement("if");
        ifOffsetNotNullElement.addAttribute(new Attribute("test", "offset != null"));
        ifOffsetNotNullElement.addElement(new TextElement("limit ${offset}, ${limit}"));
        ifLimitNotNullElement.addElement(ifOffsetNotNullElement);

        XmlElement ifOffsetNullElement = new XmlElement("if");
        ifOffsetNullElement.addAttribute(new Attribute("test", "offset == null"));
        ifOffsetNullElement.addElement(new TextElement("limit ${limit}"));
        ifLimitNotNullElement.addElement(ifOffsetNullElement);

        ele.addElement(ifLimitNotNullElement);
        return true;
    }



}
