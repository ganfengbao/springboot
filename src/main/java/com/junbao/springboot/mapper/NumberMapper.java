package com.junbao.springboot.mapper;

import com.junbao.springboot.pojo.Number;

import java.util.List;

public interface NumberMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Number record);

    int insertSelective(Number record);

    Number selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Number record);

    int updateByPrimaryKey(Number record);

    List<Number> selectAll();
}