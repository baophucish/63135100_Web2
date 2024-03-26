package thigk_ntu63135100.nguyenhoangbaophuc_qlbanhang.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import thigk_ntu63135100.nguyenhoangbaophuc_qlbanhang.services.MatHangService;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @Autowired
    private MatHangService matHangService;

    @GetMapping("/mathang")
    public String getAllProducts(Model model) {
        model.addAttribute("dsMH", matHangService.getAllProducts());
        return "danhsachMH";
    }

}
