package cn.tisson.wechat.dao;

import cn.tisson.wechat.pojo.UpmsLog;
import cn.tisson.wechat.pojo.UpmsLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsLogMapper {
    /**
     * 通过条件统计总数
     */
    long countByExample(UpmsLogExample example);

    /**
     * 通过条件删除数据
     */
    int deleteByExample(UpmsLogExample example);

    /**
     * 通过主键删除数据
     */
    int deleteByPrimaryKey(Integer logId);

    /**
     * 插入数据（包括Blob、Clob字段）
     */
    int insert(UpmsLog record);

    /**
     * 插入数据，如果对应的值为空，则不会更新
     */
    int insertSelective(UpmsLog record);

    /**
     * 通过条件查询（包括Blob、Clob字段）
     */
    List<UpmsLog> selectByExampleWithBLOBs(UpmsLogExample example);

    /**
     * 通过条件查询（不包括Blob、Clob字段）
     */
    List<UpmsLog> selectByExample(UpmsLogExample example);

    /**
     * 通过主键查询（包括Blob、Clob字段）
     */
    UpmsLog selectByPrimaryKey(Integer logId);

    /**
     * 通过条件更新数据（包括Blob、Clob字段），如果对应的值为空，则不会更新
     */
    int updateByExampleSelective(@Param("record") UpmsLog record, @Param("example") UpmsLogExample example);

    /**
     * 通过条件更新数据（包括Blob、Clob字段）
     */
    int updateByExampleWithBLOBs(@Param("record") UpmsLog record, @Param("example") UpmsLogExample example);

    /**
     * 通过条件更新数据（不包括Blob、Clob字段）
     */
    int updateByExample(@Param("record") UpmsLog record, @Param("example") UpmsLogExample example);

    /**
     * 通过主键更新数据（包括Blob、Clob字段），如果对应的值为空，则不会更新
     */
    int updateByPrimaryKeySelective(UpmsLog record);

    /**
     * 通过主键更新数据（包括Blob、Clob字段）
     */
    int updateByPrimaryKeyWithBLOBs(UpmsLog record);

    /**
     * 通过主键更新数据（不包括Blob、Clob字段）
     */
    int updateByPrimaryKey(UpmsLog record);
}