package cn.tisson.wechat.dao;

import cn.tisson.wechat.pojo.UpmsSystem;
import cn.tisson.wechat.pojo.UpmsSystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsSystemMapper {
    /**
     * 通过条件统计总数
     */
    long countByExample(UpmsSystemExample example);

    /**
     * 通过条件删除数据
     */
    int deleteByExample(UpmsSystemExample example);

    /**
     * 通过主键删除数据
     */
    int deleteByPrimaryKey(Integer systemId);

    /**
     * 插入数据（包括Blob、Clob字段）
     */
    int insert(UpmsSystem record);

    /**
     * 插入数据，如果对应的值为空，则不会更新
     */
    int insertSelective(UpmsSystem record);

    /**
     * 通过条件查询（不包括Blob、Clob字段）
     */
    List<UpmsSystem> selectByExample(UpmsSystemExample example);

    /**
     * 通过主键查询（包括Blob、Clob字段）
     */
    UpmsSystem selectByPrimaryKey(Integer systemId);

    /**
     * 通过条件更新数据（包括Blob、Clob字段），如果对应的值为空，则不会更新
     */
    int updateByExampleSelective(@Param("record") UpmsSystem record, @Param("example") UpmsSystemExample example);

    /**
     * 通过条件更新数据（不包括Blob、Clob字段）
     */
    int updateByExample(@Param("record") UpmsSystem record, @Param("example") UpmsSystemExample example);

    /**
     * 通过主键更新数据（包括Blob、Clob字段），如果对应的值为空，则不会更新
     */
    int updateByPrimaryKeySelective(UpmsSystem record);

    /**
     * 通过主键更新数据（不包括Blob、Clob字段）
     */
    int updateByPrimaryKey(UpmsSystem record);
}