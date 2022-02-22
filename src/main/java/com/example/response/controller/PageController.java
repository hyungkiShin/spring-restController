package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main() {
        return "main.html";
    }

    @ResponseBody
    @GetMapping("/user")
    public User user() {
        var user = new User(); // var 는 자바 11 버전 이후부터 생겼다. -> 타입추론이 가능하다.
        user.setName("steave");
        user.setAddress("패스트캠퍼스");
        return user;
    }
}
