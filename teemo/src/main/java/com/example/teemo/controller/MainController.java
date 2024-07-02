package com.example.teemo.controller;

import com.example.teemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class MainController {
    private final UserService userService;
    @GetMapping("/")
    public String main(){
        return"main";
    }
}