package com.middleschool.grade.common.mapper;

import com.middleschool.grade.common.dto.MgGrade;
import com.middleschool.grade.common.dto.MgGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgGradeMapper {
    int countByExample(MgGradeExample example);

    int deleteByExample(MgGradeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MgGrade record);

    int insertSelective(MgGrade record);

    List<MgGrade> selectByExample(MgGradeExample example);

    MgGrade selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MgGrade record, @Param("example") MgGradeExample example);

    int updateByExample(@Param("record") MgGrade record, @Param("example") MgGradeExample example);

    int updateByPrimaryKeySelective(MgGrade record);

    int updateByPrimaryKey(MgGrade record);
}