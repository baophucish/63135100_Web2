package baophucish.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // xay dung cac action
    // mapping URL la gi
    @GetMapping("/login")
    public String dangNhap() {
        return "login";
    }

    @GetMapping("/register")
    public String dangKy() {
        return "register";
    }

}
