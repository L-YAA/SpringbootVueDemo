package com.huihe.back.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {
    @CrossOrigin
    @GetMapping("/api/index")
    @ResponseBody //将返回的字符串进行解析在前端显示
    //@ResponseBody的作用其实是将java对象转为json格式的数据。
    public String index(){
        System.out.println("Hello World");
        return "Hello World";
    }
    @CrossOrigin
    @PostMapping("/api/hello")
    @ResponseBody //将返回的字符串进行解析在前端显示
    //@ResponseBody的作用其实是将java对象转为json格式的数据。
    public String hello(){
        System.out.println("Hello login");
        return "Hello login";
    }
}
