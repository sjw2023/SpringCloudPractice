package org.example.cloudpracticeserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test1")
    public String test(){
        return "test1";
    }
}
