package com.example.respones.controller;

import com.example.respones.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    // text
    @GetMapping("/text")
    public String text(@RequestParam String account) {

        return account;
    }

    @PostMapping("/json")
    public User json(@RequestBody User user){ // User라는 객체를 RequestBody로 받아서 user를 리턴해줬다.
        // 동작의 원리 req -> object Mapper -> object로 변환 -> method -> object -> object Mapper -> JSON -> res
        return user;
    }

    // ResponseEntity 사용
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user) {

        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
