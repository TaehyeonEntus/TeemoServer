package com.example.teemo.controller;

import com.example.teemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class SignUpController {
    private final UserService userService;
    @PostMapping("/signUp")
    public String join(){
        return "signUp";
    }
}
