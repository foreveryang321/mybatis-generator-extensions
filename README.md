mybatis-generator-core 1.3.5逆向工程缺点：
```
1、不能查询动态语句（查询所有数据表字段，这样对内存消耗比较大）
2、不支持分页
3、不能根据数据表对字段的注释生成javaBean的注释
4、生成的Mapper，不符合我们一贯的dao风格
5、生成的查询类Example，语义不够明确
```
本mybatis-generator-extensions逆向工程是mybatis-generator-core的扩展，都解决了以上问题


可以执行Generator.java进行测试，配置是src/test/resource/mybatis-generator.xml

接口名
IntrospectedTable
DefaultDAOMethodNameCalculator