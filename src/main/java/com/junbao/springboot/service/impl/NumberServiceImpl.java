package com.junbao.springboot.service.impl;

import com.junbao.springboot.mapper.NumberMapper;
import com.junbao.springboot.pojo.Number;
import com.junbao.springboot.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NumberServiceImpl implements NumberService{

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private NumberMapper numberMapper;

    @Override
    public Number getAllById(Integer id) {
        return numberMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertNumber(Number number) {
        return numberMapper.insertSelective(number);
    }

    @Override
    public List<Number> getAll() {
        return numberMapper.selectAll();
    }

}
