package com.example.displaylistobjectpagination.controllers;

import java.util.Optional;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.displaylistobjectpagination.models.SinhVien;
import com.example.displaylistobjectpagination.services.SinhVienService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SinhVienController {
    @Autowired
    private SinhVienService sinhVienService;

    @GetMapping("/dsSV")
    public String DanhSachSinhVien(Model model, @RequestParam("page") Optional<Integer> page,
            @RequestParam("size") Optional<Integer> size) {
        final int currentPage = page.orElse(1);
        final int pageSize = page.orElse(5);
        Page<SinhVien> svPage = sinhVienService.findPaginated(PageRequest.of(currentPage - 1, pageSize));
        model.addAttribute("dsSV", svPage);
        int totalPages = svPage.getTotalPages();

        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages).boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "sinhvien_getAll_page";
    }

}
