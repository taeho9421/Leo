package com.example.study.controller;

import com.example.study.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {

    // HTML <Form>
    // ajax 검색에 주로 사용된다.
    // Http post body 에 data를 집어넣어 보내겠다는 의미.
    // json, xml, multipart-form, text-plain

    @PostMapping(value = "/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam) {

        return searchParam;
    }

    @PutMapping("/putMethod")
    public void put() {

    }

}
