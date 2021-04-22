package com.fastcampus.jpa.bookmanager.domain;

import lombok.*;

import java.time.LocalDateTime;

//@Getter
//@Setter
//@ToString
@NoArgsConstructor // 인자가 없는 생성자
@AllArgsConstructor // 필드에있는 모든 인자를 받아서 생성하는 생성자
@RequiredArgsConstructor // 필요한 인자만을 이용하여 생성자를 만들어줌
//@EqualsAndHashCode
@Data // Entity 객체를 사용하기위해 제일 많이 사용되는 어노테이션
@Builder
public class User {
    @NonNull // 필수값을 지정할떄
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

//    @Override
//    public String toString() {
//        return getClass().getName()
//                +" : "
//                +"name= " +name
//                +", email= "+email
//                +", createdAt= "+createdAt
//                +", updatedAt= "+updatedAt;
//    }
}
