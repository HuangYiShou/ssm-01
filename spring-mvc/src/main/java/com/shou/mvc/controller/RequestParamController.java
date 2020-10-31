package com.shou.mvc.controller;

import com.shou.mvc.dto.UserRequestParam;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

/**
 * @RequesParam
 * 有request 默认为true 为必要参数 --设置为false则为非必要参数 还可以赋值为默认
 * 使用的三个场景
 * 1传入的参数名与自己定义接收的参数名格式不相同时用来起别名
 * 2当浏览器传入的参数与方法的参数不一致的时候
 * 3到传入复杂对象的时候可以可以解析陈对应的json对象
 */
@Component

//@Controller
public class RequestParamController {

    /**
     * 大型项目不同模块别人传的参数命名与java命名规范不一致时
     * 取别名
     */

    @GetMapping("/reqParam1")
    @ResponseBody
    public String test1(@RequestParam(value = "user_id") Integer userId){
        System.out.println(userId);
        return "requesParam修饰参数取别名";
    }

    /**
     *接收参数与方法参数不一一致时
     */
    @GetMapping("/reqParam2")
    @ResponseBody
    public String test2(@RequestParam(value = "username",required = false) String name,
                        @RequestParam(value = "page",required = false ,defaultValue = "1") int page,
                        @RequestParam(value = "size",required = false,defaultValue = "10") int size){
        return "requesParam修饰与方法的参数不一致的情况";
    }

    /**
     * 用来接收复杂的jason数据
     * @return
     */
    @PostMapping("/reParam3")
    @ResponseBody
    public UserRequestParam test3(@RequestBody UserRequestParam userRequestParam){

        System.out.println(userRequestParam.getList().toString());
        return userRequestParam;
    }

}
