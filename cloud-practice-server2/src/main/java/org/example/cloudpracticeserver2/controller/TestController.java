package org.example.cloudpracticeserver2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test2")
    public String test(){
        return "test2";
    }
}
