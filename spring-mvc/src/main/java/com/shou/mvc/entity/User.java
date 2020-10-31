package com.shou.mvc.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class User implements Serializable {
    private Integer userId;
    private String username;
    private Integer age;
}
