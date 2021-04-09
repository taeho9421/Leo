package com.example.delete.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteApiController {

    @DeleteMapping("/delete/{userid}")
    public void delete(@PathVariable String userid, @RequestParam String account){
        System.out.println(userid);
        System.out.println(account);

        // delete == 리소스의 삭제
    }
}
