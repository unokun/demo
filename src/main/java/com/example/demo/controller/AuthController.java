package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class AuthController {

    @GetMapping("/login")
    public String userLogin() {
        return "/login";
    }

    @PostMapping("/login")
    public String userLoginPost() {
        return "redirect:/login-error";
    }

    @GetMapping("/login-error")
    public String userLoginError(Model model) {
        model.addAttribute("loginError", true);
        return "/user/login";
    }
}
