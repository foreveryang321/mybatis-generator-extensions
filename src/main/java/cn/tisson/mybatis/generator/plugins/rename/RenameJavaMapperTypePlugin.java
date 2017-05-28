package cn.tisson.mybatis.generator.plugins.rename;


import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.mybatis.generator.internal.util.StringUtility.stringHasValue;
import static org.mybatis.generator.internal.util.messages.Messages.getString;

/**
 * 重命名生成的Mapper类的名字：也就是把生成的类中的Mapper替换其他，比如Dao
 * <p>
 * 插件接收2个属性:
 * <ul>
 * <li><tt>searchString</tt> (required) the regular expression of the name search.</li>
 * <li><tt>replaceString</tt> (required) the replacement String.</li>
 * </ul>
 *
 * For example, to change the name of the generated Example classes from xxxExample to xxxCriteria,
 * specify the following:
 *
 * <dl>
 * <dt>searchString</dt>
 * <dd>Example$</dd>
 * <dt>replaceString</dt>
 * <dd>Criteria</dd>
 * </dl>
 *
 *
 * @author Created by yl on 2017/05/28.
 *
 */
public class RenameJavaMapperTypePlugin extends PluginAdapter {
    private String searchString;
    private String replaceString;
    private Pattern pattern;


    public RenameJavaMapperTypePlugin() {
    }

    public boolean validate(List<String> warnings) {
        searchString = properties.getProperty("searchString"); //$NON-NLS-1$
        replaceString = properties.getProperty("replaceString"); //$NON-NLS-1$
        boolean valid = stringHasValue(searchString) && stringHasValue(replaceString);
        if (valid) {
            pattern = Pattern.compile(searchString);
        } else {
            if (!stringHasValue(searchString)) {
                warnings.add(getString("ValidationError.18", //$NON-NLS-1$
                        "RenameExampleClassPlugin", //$NON-NLS-1$
                        "searchString")); //$NON-NLS-1$
            }
            if (!stringHasValue(replaceString)) {
                warnings.add(getString("ValidationError.18", //$NON-NLS-1$
                        "RenameExampleClassPlugin", //$NON-NLS-1$
                        "replaceString")); //$NON-NLS-1$
            }
        }
        return valid;
    }

    @Override
    public void initialized(IntrospectedTable introspectedTable) {
        String oldType = introspectedTable.getMyBatis3JavaMapperType();
        Matcher matcher = pattern.matcher(oldType);
        oldType = matcher.replaceAll(replaceString);
        introspectedTable.setMyBatis3JavaMapperType(oldType);
    }
}

