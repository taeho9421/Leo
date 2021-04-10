package com.example.study.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor // 생성자 추가
public class SearchParam {

    private String account;
    private String email;
    private int page;

}
