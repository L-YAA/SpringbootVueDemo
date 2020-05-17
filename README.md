# SpringbootVueDemo
👢Springboot+🎄Vue 培训项目

## [🎉csdn教程地址](https://learner.blog.csdn.net/article/details/88925013)
1. 前端技术栈
   	1. Vue.js
   2. ElementUI
   3. axios
   
2. 后端技术栈
   1. SpringBoot
   2. SpringData + JPA
   3. MySQL
   4. ~~Shiro~~

##   学习步骤

1. maven 环境配置 

   1. [Maven 下载地址](http://maven.apache.org/download.cgi) 
   2. [Maven教程](https://www.runoob.com/maven/maven-setup.html)

2. 创建springboot模块

   1. 运行BackApplication验证8080端口

   2. 编写第一个controller层进行测试 hello word

      1. > @Controller 注解
         > @GetMapping("/index")
         > @ResponseBody //将返回的字符串进行解析在前端显示
         > //@ResponseBody的作用其实是将java对象转为json格式的数据。
         >
         > @RestController注解相当于@ResponseBody ＋ @Controller合在一起的作用

      2. ```java
         package com.huihe.back.controller;
         import org.springframework.stereotype.Controller;
         import org.springframework.web.bind.annotation.GetMapping;
         import org.springframework.web.bind.annotation.ResponseBody;
         
         @Controller
         public class IndexController {
         
             @GetMapping("/index")
             @ResponseBody //将返回的字符串进行解析在前端显示
             //@ResponseBody的作用其实是将java对象转为json格式的数据。
             public String index(){
                 System.out.println("Hello World");
                 return "Hello World";
             }
         }
         
         ```

3. 安装 Vue CLI  [🔗下载地址](https://nodejs.org/en/)

   1. 使用 npm 安装 Vue CLI  
   2. npm 是集成在 Node.js 中  

      - 安装npm [访问官网](https://nodejs.org/en/)

      - `node -v`，检查是否安装成功
   3.`npm -g install npm` ，将 npm 更新至最新版本
   4. 使用 cnmp 的好处是在日后下载内容时会比较快
      - npm install -g cnpm --registry=https://registry.npm.taobao.org
   5. 使用 `npm install -g vue-cli` 安装脚手架
   
4.  初始化项目

   1. vue init webpack front(这里的front可替换成项目名)
   2. 一路按y 或者回车
   3. npm run dev 运行项目测试

5. 安装axios

   1. npm i axios -S安装axios
   
6. git commit -m+"全称"