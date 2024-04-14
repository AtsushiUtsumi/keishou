package com.example.hoge.select;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String homeDisp(Model model) {
        HelloForm helloForm = new HelloForm();
        model.addAttribute("form", helloForm);
        //model.addAttribute(form);
        return "home";
    }

    @PostMapping("/")
    public String test(HelloForm formm, Model model) {
        formm.setName("テスト");
        model.addAttribute("form", formm);
        return "home";
    }

    @GetMapping("/sheet")
    public String sheet() {
        return "sheet";
    }
}