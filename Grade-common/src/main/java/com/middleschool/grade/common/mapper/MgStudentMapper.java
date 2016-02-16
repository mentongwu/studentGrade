package com.middleschool.grade.common.mapper;

import com.middleschool.grade.common.dto.MgStudent;
import com.middleschool.grade.common.dto.MgStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgStudentMapper {
    int countByExample(MgStudentExample example);

    int deleteByExample(MgStudentExample example);

    int deleteByPrimaryKey(Long studentNum);

    int insert(MgStudent record);

    int insertSelective(MgStudent record);

    List<MgStudent> selectByExample(MgStudentExample example);

    MgStudent selectByPrimaryKey(Long studentNum);

    int updateByExampleSelective(@Param("record") MgStudent record, @Param("example") MgStudentExample example);

    int updateByExample(@Param("record") MgStudent record, @Param("example") MgStudentExample example);

    int updateByPrimaryKeySelective(MgStudent record);

    int updateByPrimaryKey(MgStudent record);
}