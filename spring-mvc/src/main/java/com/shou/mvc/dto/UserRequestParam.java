package com.shou.mvc.dto;

import lombok.Data;

import java.util.List;
@Data
public class UserRequestParam {
    private Integer userId;
    private String username;
    private Integer age;
    private List<Address> list;
}
