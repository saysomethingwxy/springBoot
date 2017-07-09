package it.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.entity.User;
import it.service.UserService;

@RestController
public class UserController {
  @Autowired
  private UserService userservice;

  @RequestMapping("value")
  public String getValue() {
    return "hello!";
  }
  
  @RequestMapping("/db")
  public List<User> getUser(){
    return userservice.findall();
  }

}
