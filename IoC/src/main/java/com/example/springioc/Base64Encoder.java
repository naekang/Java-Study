package com.example.springioc;

import org.springframework.stereotype.Component;

import java.util.Base64;

// 다른 이름으로 사용하고자 할때 이름 지정
@Component("base74Encoder")
public class Base64Encoder implements IEncoder {

    public String encode(String message) {
        return Base64.getEncoder().encodeToString(message.getBytes());
    }
}
