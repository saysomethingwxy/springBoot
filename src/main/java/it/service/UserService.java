package it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import it.entity.User;
import it.mapper.UserMapper;

@Service
public class UserService {

  @Autowired
  private UserMapper usermap;

  @Cacheable(value="findall")
  public List<User> findall() {
    System.out.println("缓存");
    return usermap.findall();
  }

}
