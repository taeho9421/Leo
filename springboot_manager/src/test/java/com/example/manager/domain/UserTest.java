package com.example.manager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test() {
        User user = new User();
        user.setEmail("taeho9421@naver.com");
        user.setName("이태호");
        //user.setCreatedAt(LocalDate.now());
        //user.setUpdatedAt(LocalDate.now());

        User user2 = User.builder().name("윤태걸").email("taetae@gmail.com").build();


        System.out.println(">>> "+user2);
    }
}