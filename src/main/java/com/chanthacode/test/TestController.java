package com.chanthacode.test;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController()
public class TestController {

    @RequestMapping("/helloworld")
    public String hello(){
        return "Hello world";
    }


    @RequestMapping("/code")
    public String code(){
        return "Code";
    }
}
