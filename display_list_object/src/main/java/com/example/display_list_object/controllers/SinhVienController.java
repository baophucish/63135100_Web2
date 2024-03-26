package com.example.display_list_object.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import com.example.display_list_object.models.SinhVien;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SinhVienController {
    // hardcode de co data demo
    static List<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
    static {
        dsSinhVien.add(new SinhVien("63135100", "Nguyen Phuc"));
        dsSinhVien.add(new SinhVien("63132362", "Phan Nguyen"));
    }

    @GetMapping("/studentlist")
    public String ListStudent(ModelMap model) {
        model.addAttribute("dsSV", dsSinhVien);
        return "sinhvien_getall";
    }

}
