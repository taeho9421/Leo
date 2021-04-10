package com.example.study.repository;

import com.example.study.StudyApplication;
import com.example.study.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class UserRepositoryTest extends StudyApplication {

    @Autowired // DI(의존성주입), 직접 객체를 만들지않고 스프링이 직접 관리를 한다.
    private UserRepository userRepository;

    @Test
    public void create() {
        // String sql = insert into user (%s, %s, %d) value (account,email,age);
        User user = new User();

        user.setAccount("TestUser01");
        user.setEmail("TestUser@naver.com");
        user.setPhoneNumber("010-4241-3423");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("admin");

        User newUser = userRepository.save(user);
        System.out.println("newUser: "+newUser);
    }

    public void read() {

    }

    public void update() {

    }

    public void delete() {

    }
}
