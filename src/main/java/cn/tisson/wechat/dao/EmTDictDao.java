package cn.tisson.wechat.dao;

import cn.tisson.wechat.pojo.EmTDict;
import cn.tisson.wechat.pojo.EmTDictQuery;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmTDictDao {
    long countByExample(EmTDictQuery example);

    int deleteByExample(EmTDictQuery example);

    int deleteByPrimaryKey(String dictKey);

    int insert(EmTDict record);

    int insertSelective(EmTDict record);

    List<EmTDict> selectByExampleWithBLOBs(EmTDictQuery example);

    List<EmTDict> selectByExample(EmTDictQuery example);

    EmTDict selectByPrimaryKey(String dictKey);

    int updateByExampleSelective(@Param("record") EmTDict record, @Param("example") EmTDictQuery example);

    int updateByExampleWithBLOBs(@Param("record") EmTDict record, @Param("example") EmTDictQuery example);

    int updateByExample(@Param("record") EmTDict record, @Param("example") EmTDictQuery example);

    int updateByPrimaryKeySelective(EmTDict record);

    int updateByPrimaryKeyWithBLOBs(EmTDict record);

    int updateByPrimaryKey(EmTDict record);
}