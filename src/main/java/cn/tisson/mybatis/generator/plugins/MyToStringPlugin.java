package cn.tisson.mybatis.generator.plugins;

import static org.mybatis.generator.internal.util.StringUtility.isTrue;

import java.util.List;
import java.util.Properties;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import cn.tisson.mybatis.generator.plugins.util.PluginUtils;

/**
 * model类生成toString方法
 *
 * @author Created by YL on 2017/5/28.
 */
public class MyToStringPlugin extends PluginAdapter {
    private boolean useToStringFromRoot;

    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
        useToStringFromRoot = isTrue(properties.getProperty("useToStringFromRoot"));
    }

    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass clazz, IntrospectedTable table) {
        PluginUtils.createToStringMethod(context, clazz, table, useToStringFromRoot);
        return super.modelBaseRecordClassGenerated(clazz, table);
    }

    @Override
    public boolean modelRecordWithBLOBsClassGenerated(TopLevelClass clazz,
            IntrospectedTable table) {
        PluginUtils.createToStringMethod(context, clazz, table, useToStringFromRoot);
        return super.modelRecordWithBLOBsClassGenerated(clazz, table);
    }

    @Override
    public boolean modelPrimaryKeyClassGenerated(TopLevelClass clazz, IntrospectedTable table) {
        PluginUtils.createToStringMethod(context, clazz, table, useToStringFromRoot);
        return super.modelPrimaryKeyClassGenerated(clazz, table);
    }
}
