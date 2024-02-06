package org.example.cloudpracticeserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    @RequestMapping("/test1")
    public String test(){
        return "test1";
    }

    @RequestMapping("/restClientGetTest")
    public String test2(){
        RestClient restClient = RestClient.create();
        return restClient.get()
                .uri("http://localhost:8080/test2")
                .retrieve()
                .body(String.class);
    }
    @RequestMapping("/restClientPostTest")
    public String test3(){
        RestClient restClient = RestClient.create();
        return restClient.post()
                .uri("http://localhost:8080/test2")
                .retrieve()
                .body(String.class);
    }
//    @RequestMapping("/webClientGetTest")
//    public String test4(){
//        WebClient
//    }
//


}
