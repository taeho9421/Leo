package com.example.manager.repository;

import com.example.manager.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    // <Entity타입, Entity의 PK(id)값>
}
