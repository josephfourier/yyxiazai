package com.yyxiazai.service;

import com.github.abel533.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseService<T> {
  @Autowired
  private Mapper<T> mapper;

  public T queryById(Long id) {
    return mapper.selectByPrimaryKey(id);
  }

  public T queryOne(T record) {
    return mapper.selectOne(record);
  }

}
