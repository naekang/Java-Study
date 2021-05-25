package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path="/hello") // http://localhost:9090/api/get/hello
    public String hello() {
        return "get Hello!";
    }

    @RequestMapping(path="/hi", method = RequestMethod.GET) // method를 지정하지 않으면 /get /post /put /delete 모든 메소드가 다 동작 -> 옛날 방식
    public String hi() {
        return "hi";
    }

    // http://localhost:9090/api/get/path-variable/{name}
    // 변화하는 부분 처리하기
    // 변수 이름을 다르게 지정해야할 떄 @PathVariable(바꿀(실제 사용할) 변수 = "원래 변수") 형식으로 지정
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName, String name) {
        System.out.println("PathVariable : " + pathName);
        return pathName;
    }

    // search?q = intellij
    // &rlz = 1C5CHFA_enKR929KR929&oq=intellij
    // &aqs = chrome..69i57j69i59j35i39j69i59j0i20i263j69i61j69i60l2.4881j0j9
    // &sourceid = chrome
    // &ie = UTF-8

    // ?key=value&key2=value2

    //http://localhost:9090/api/get/query-param?user=ashe&email=rlawlsgh6306@gmail.com&age=25
    @GetMapping(path="query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey()+ " = "+entry.getValue()+"\n");
        });


        return sb.toString();

    }

    @GetMapping(path="query-param02")
    public String queryParam02(
            // 변수가 너무 많아지면 dto 방식 사용
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ) {

        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name+" "+email+" "+age;
    }

    // 변수, 키에 해당하는 것들을 매칭
    @GetMapping(path="query-param03")
    public String queryParam03(UserRequest userRequest) {

        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }

}
