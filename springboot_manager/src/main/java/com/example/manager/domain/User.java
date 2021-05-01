package com.example.manager.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@RequiredArgsConstructor
@AllArgsConstructor // 객체가 가지고있는 모든 필드를 인자로 가지고 있는 생성자
@NoArgsConstructor // 인자가 없는 생성자
@Data
@Builder
@Entity // 객체를 Entity로 선언 , PK가 반드시 필요
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @NonNull // 필수값
    private String name;

    @NonNull
    private String email;

    private LocalDate createdAt;

    private LocalDate updatedAt;
}
