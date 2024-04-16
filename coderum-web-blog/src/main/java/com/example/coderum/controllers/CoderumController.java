package com.example.coderum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CoderumController {
    @GetMapping("/")
    public String trangChu() {
        return "homepage";
    }

    @GetMapping("/login")
    public String dangNhap() {
        return "login";
    }

    @GetMapping("/register")
    public String dangKy() {
        return "register";
    }

}
