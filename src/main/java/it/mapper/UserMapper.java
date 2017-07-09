package it.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import it.entity.User;

@Mapper
public interface UserMapper {

  public List<User> findall();

}
