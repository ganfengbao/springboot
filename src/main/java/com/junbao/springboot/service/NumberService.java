package com.junbao.springboot.service;

import com.junbao.springboot.pojo.Number;

import java.util.List;

public interface NumberService {

    Number getAllById(Integer id);

    int insertNumber(Number number);

    List<Number> getAll();
}
