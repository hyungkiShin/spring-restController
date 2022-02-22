package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    // TEXT
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account + "입니다.";
    }

    // JSON
    /*
        req -> object mapper -> object 로 바뀌어요 ->
        method (우리 메서드 와서) -> object 를 던지고 -> object mapper 를 통해서 -> json 으로 바뀌어서 -> response 으로 내려간다.
     */
    @PostMapping("/json")
    public User json(@RequestBody User user) {
        System.out.println("user.toString() = " + user.toString());
        return user;
    }


    // response 를 내려줄때 Http Status 를 정해줄꺼야. 그러기 위해서는 ResponseEntity 를 통해서 내려줄꺼야.
    // Response
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
