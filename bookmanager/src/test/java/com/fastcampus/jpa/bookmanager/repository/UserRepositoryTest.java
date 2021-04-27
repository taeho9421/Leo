package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() { // create read update delete
        // user를 생성하고 테이블에 저장하겠음.
        userRepository.save(new User());

        // user테이블에 있는 모든 데이터를 리스트 형식으로 가져오겠다.
        System.out.println(">>> "+userRepository.findAll());


    }
}