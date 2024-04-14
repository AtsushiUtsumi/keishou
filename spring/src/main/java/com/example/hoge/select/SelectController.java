package com.example.hoge.select;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/select")
public class SelectController {

    @GetMapping()
	@ResponseBody
	public String home() {
		return "ホーム画面にしたい";
	}

    @GetMapping("/a")
    //@ResponseBody
    public String method1() {
        return "home";
    }

    @RequestMapping("/method1")
    public String method2() {
        return "/home.html";
    }
}
