package it.entity;

import java.io.Serializable;

public class User implements Serializable {
  /**
   *序列号
   */
  private static final long serialVersionUID = 1L;
  private String id;
  private String name;
  private String sex;
  public final String getId() {
    return id;
  }
  public final void setId(String id) {
    this.id = id;
  }
  public final String getName() {
    return name;
  }
  public final void setName(String name) {
    this.name = name;
  }
  public final String getSex() {
    return sex;
  }
  public final void setSex(String sex) {
    this.sex = sex;
  }
  
  

}
