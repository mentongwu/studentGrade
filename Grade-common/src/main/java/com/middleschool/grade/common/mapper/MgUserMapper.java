package com.middleschool.grade.common.mapper;

import com.middleschool.grade.common.dto.MgUser;
import com.middleschool.grade.common.dto.MgUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgUserMapper {
    int countByExample(MgUserExample example);

    int deleteByExample(MgUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MgUser record);

    int insertSelective(MgUser record);

    List<MgUser> selectByExample(MgUserExample example);

    MgUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MgUser record, @Param("example") MgUserExample example);

    int updateByExample(@Param("record") MgUser record, @Param("example") MgUserExample example);

    int updateByPrimaryKeySelective(MgUser record);

    int updateByPrimaryKey(MgUser record);
}