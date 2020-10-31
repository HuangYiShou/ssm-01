package com.shou.mvc.dto;

import lombok.Data;

@Data
public class UserDto {
    private Integer userId;
    private String username;
    private Integer age;
    private Address address;

}
