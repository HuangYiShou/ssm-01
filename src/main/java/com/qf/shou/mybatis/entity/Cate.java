package com.qf.shou.mybatis.entity;


import java.io.Serializable;
import java.util.Date;

public class Cate implements Serializable {

  private Integer cateId;
  private String name;
  private Date createDate;
  private Integer status;


  public Integer getCateId() {
    return cateId;
  }

  public void setCateId(Integer cateId) {
    this.cateId = cateId;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate() {
    this.createDate = createDate;
  }


  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

}
