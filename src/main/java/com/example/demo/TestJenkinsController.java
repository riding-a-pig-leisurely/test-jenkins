package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 詹俊铭
 * @description:
 * @date 2021/01/19
 * @time 18:02
 */
@RestController
public class TestJenkinsController {

    @RequestMapping("/index")
    public String testJenkins(){
        return "hello world!";
    }
}
