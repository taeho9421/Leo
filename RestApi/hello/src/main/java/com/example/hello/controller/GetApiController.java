package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path="/hello") //http://localhost:8080/api/get/hello
    public String Hello(){
        return "get Hello!";
    }

    // 예전 방식
    @RequestMapping(path="/hi",method = RequestMethod.GET) // 모든 메소드가 동작한다(put post put delete)
    public String hi(){
        return "hi";
    }


    @GetMapping("/path-variable/{name}") // http://localhost:8080/api/get/path-variable/{변화하는값}
    public String pathVariable(@PathVariable String name){
        System.out.println("PathVariable :" +name);
        return name;
    }
    /*
    @GetMapping("/path-variable/{name}") // http://localhost:8080/api/get/path-variable/{변화하는값}
    public String pathVariable(@PathVariable(name = name) String pathName,String name){
        System.out.println("PathVariable :" +pathName);
        return pathName;
    }

    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String,String> queryParam){

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach( entry  -> {
           System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey()+"= "+entry.getValue()+"\n");
        });
        return sb.toString();
    }
    */
    @GetMapping("query-param02")
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ){

        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name+""+email+""+age;
    }

    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest){

        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }
}
