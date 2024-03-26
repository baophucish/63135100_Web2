package com.example.form_submit_thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.form_submit_thymeleaf.models.SinhVien;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SinhVienController {
    @GetMapping("/addSV")
    public String showForm(Model sv) {
        SinhVien sinhVien = new SinhVien();
        sv.addAttribute("svDTO", sinhVien);
        return "addSV_Form";
    }

    @PostMapping("/addSV")
    public String submitForm(@ModelAttribute("svDTO") SinhVien sv) {
        // TODO: process POST request

        return "addSV_OK";
    }

}
