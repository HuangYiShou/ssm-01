package com.shou.mvc.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class Address implements Serializable {
    private  Integer id;
    private  String city;
}
