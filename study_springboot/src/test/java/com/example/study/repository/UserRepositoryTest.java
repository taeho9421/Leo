package com.example.study.repository;

import com.example.study.StudyApplication;
import com.example.study.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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

    @Test
    public void read() {


    }

    @Test
    public void update() {
        Optional<User> user = userRepository.findById(2L);

        user.ifPresent(selectUser-> {
            selectUser.setAccount("ppp");
            selectUser.setUpdateAt(LocalDateTime.now());
            selectUser.setUpdateBy("update() method");

            userRepository.save(selectUser);
        });
    }

    @Test
    @DeleteMapping("/api/user")
    public void delete(@RequestParam Long id) {
        Optional<User> user = userRepository.findById(2L);


        user.ifPresent(selectUser->{
            userRepository.delete(selectUser);
        });

    }
}
