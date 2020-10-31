package com.shou.mvc.controller;

import com.shou.mvc.dto.UserDto;
import com.shou.mvc.entity.User;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 如何接收参数
 * <p
 * 1基本类型 直接声明就行
 * 2简单对象（复杂对象）
 * 3数组 map
 * 4集合list
 * 5日期
 */
@Controller
public class BaseController {

    /**
     * 接收基本类型直接声明要和自己定义的属性一一对应
     * @param userId
     * @param username
     * @param age
     * @return
     */
    @GetMapping("t1")
    @ResponseBody
    public User test1(int userId,String username,int age){
        User user = new User();
        user.setUserId(userId);
        user.setUsername(username);
        user.setAge(age);
        return user;
    }

    /**
     * 接收对象
     */
    @GetMapping("/t2")
    @ResponseBody
    public UserDto test2(UserDto userDto){
        System.out.println(userDto);
        System.out.println(userDto.getAddress().getCity());
        System.out.println(userDto.getAddress().getId());
        return userDto;
    }
}
