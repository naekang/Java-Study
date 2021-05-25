package com.example.post.controller;

import com.example.post.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

    // 값을 미리 알고있는 경우가 아니면 사용하기 힘듦
//    @PostMapping("/post")
//    public void post(@RequestBody Map<String, Object> requestData) {
//
//        requestData.forEach((key, value) -> {
//            System.out.println("key : " + key);
//            System.out.println("value : " + value);
//        });
//    }

    @PostMapping("/post")
    public void post(@RequestBody PostRequestDto requestData) {
        System.out.println(requestData);

        requestData.getAccount();
    }

}
