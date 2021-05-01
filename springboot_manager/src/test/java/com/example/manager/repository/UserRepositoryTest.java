package com.example.manager.repository;

import com.example.manager.domain.User;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.contains;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest// JPA영역이 아니기때문에
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    void crud() { // create read update delete
        //userRepository.save(new User()); // 저장
        //userRepository.findAll().forEach(System.out::println); // 전체를 조회

        //List<User> users = userRepository.findAllById(Lists.newArrayList(1L,2L,5L));
        //users.forEach(System.out::println);

//        User user1 = new User("Jack","jack@naver.com");
//        User user2 = new User("Steve","st@gmail.com");
//
//        userRepository.saveAll(Lists.newArrayList(user1,user2));
//
//        List<User> users = userRepository.findAll();
//        users.forEach(System.out::println);
//
//       userRepository.saveAndFlush(new User("new Taeho","taeho9421@naver.com"));
//
//       userRepository.findAll().forEach(System.out::println);
//        Page<User> users = userRepository.findAll(PageRequest.of(1,3));
//
//        System.out.println("page: "+users);
//        System.out.println("totalElements: "+ users.getTotalElements());
//        System.out.println("totalPages: "+users.getTotalPages());
//        System.out.println("numberOfElements: "+ users.getNumberOfElements());
//        System.out.println("sort: "+users.getSort());
//        System.out.println("size: "+users.getSize());
//
//        users.getContent().forEach(System.out::println);

//        ExampleMatcher matcher = ExampleMatcher.matching()
//                .withIgnorePaths("name")
//                .withMatcher("email",endsWith());
//
//        Example<User> example = Example.of(new User("ma","taeho9421@sadasd.com"),matcher);
//        User user = new User();
//        user.setEmail("slow");
//
//        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("email",contains());
//        Example<User> example = Example.of(user,matcher);
//
//        userRepository.findAll(example).forEach(System.out::println);

        userRepository.save(new User("데니스", "de@naver.com"));

        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user.setEmail("davis@naver.com");

        userRepository.save(user);


    }

}
