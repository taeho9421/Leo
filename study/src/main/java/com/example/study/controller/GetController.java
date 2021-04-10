package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GetController {

    @RequestMapping(method = RequestMethod.GET,path = "/getMethod") // localhost:8080/api/getMethod 요청을 받는다
    public String getRequest() {

        return "Hi getMethod";
    }

    @GetMapping("/getParameter") // localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam(name = "password") String pwd) {
        System.out.println("id: "+id);
        System.out.println("password: "+pwd);

        return id+pwd;
    }

    // localhost:8080/api/multiParameter?account=abcd&email=taeho@naver.com&page=10
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam) {
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        // {"account":"","email":"","page":0}
        return searchParam;
    }
}
