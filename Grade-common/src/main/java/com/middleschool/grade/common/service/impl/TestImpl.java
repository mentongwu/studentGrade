package com.middleschool.grade.common.service.impl;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.middleschool.grade.common.dto.MgStudent;
import com.middleschool.grade.common.mapper.MgStudentMapper;
import com.middleschool.grade.common.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mentongwu on 16-2-15.
 */
@Service
public class TestImpl implements TestService {

    @Autowired
    private MgStudentMapper mgStudentMapper;

    @Override
    public void saveTest(MgStudent mgStudent) {
        mgStudentMapper.insertSelective(mgStudent);
    }
}
