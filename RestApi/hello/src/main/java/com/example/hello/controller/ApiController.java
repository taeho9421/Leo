package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 해당 Class는 Rest API를 처리하는 Controller로 등록된다.
@RequestMapping("/api") // RequestMapping은 url를 지정해주는 Annotation
public class ApiController {

    @GetMapping ("/hello") // http://localhost:8080/api/hello 의 주소가 매핑된것
    public String hello() {
        return "hello spring boot!";
    }

}
