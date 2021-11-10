package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    //透過 @RequestMapping 指定從/會被對應到此test()方法
    //localhost:8080
    @RequestMapping("/")
    @ResponseBody
    public String test1() {
        return "測試成功";
    }
    //localhost:8080/test
    @RequestMapping("/test")
    @ResponseBody
    public String test2() {
        return "向全世界說聲Spring Boot 很高興認識你!";
    }

}
