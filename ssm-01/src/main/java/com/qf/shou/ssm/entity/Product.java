package com.qf.shou.ssm.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Product implements Serializable {

  private Integer productId;
  private String name;
  private Integer status;



}
