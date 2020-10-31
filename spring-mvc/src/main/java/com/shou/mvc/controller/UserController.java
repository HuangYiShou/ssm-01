package com.shou.mvc.controller;


import com.shou.mvc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 返回json数据 @RestController = @Controller + @ResponseBody
 * <p
 * Get 对应 select
 * Post 对应 inset
 * Pull 对应 update
 * Delete 对应 delete
 * 如果查询的是list则方法名字用复数
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * @RequestMapping 修饰的方法必须有返回值
     *
     * value 的值对应浏览器的路径名 method属性指定浏览器请求的方法名
     * @return
     */
    @RequestMapping(value = "/list",method ={RequestMethod.GET})
    //@RequestMapping("/list")
    //@GetMapping("/list")
    @ResponseBody
    public List<User> users(){
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setAge(19);
        user.setUsername("老王");
        user.setUserId(2);
        list.add(user);
        User user2 = new User();
        user2.setAge(29);
        user2.setUsername("小王");
        user2.setUserId(3);
        list.add(user2);
        return list;
    }

    /**
     * params 属性可以对来的传入的参数做简单的判断 >=<
     * @return
     */
    @RequestMapping(value = "/info",params = "id=1")
    //@PostMapping(value = "/info",params = "id>1")
    @ResponseBody
    public User info(){
        User user = new User();
        user.setUsername("小黄");
        user.setAge(18);
        return user;
    }

    /**
     * 只能接受json数据
     * consumes 可以指定接收内容的数据类型 为json数据类型 --application/json
     * @return
     */
    //@RequestMapping(value = "/save",method = {RequestMethod.POST},consumes = "application/json")
    @PostMapping(value = "/save",consumes = "application/json")
    @ResponseBody
    public int save(){

        return 1;
    }

    /**
     * servlet
     *
     */
    @RequestMapping(value = "accpet",method = RequestMethod.POST,produces = "img/png")
    @GetMapping("")
    public String accpet(){
        return "";
    }


}
