package com.fastcampus.jpa.bookmanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Rest Api의 요청을 받을수 있다는 의미
public class HelloWorldController {

    @GetMapping("/hello-world") // hello-world를 요청받으면 리턴값을 보여주도록 만든 API
    public String helloWorld() {
        return "hello-world";
    }
}
