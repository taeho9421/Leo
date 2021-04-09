package com.example.put;

import com.example.put.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/{userid}")
    public PostRequestDto put(@RequestBody PostRequestDto requestDto, @PathVariable(name = "userid") Long id) { // 내가 보냈던 데이터를 그대로 반환하게된다.
        System.out.println(id);
        return requestDto;
    }

}
