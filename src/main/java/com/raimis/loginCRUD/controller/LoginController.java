package com.raimis.loginCRUD.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {
    @GetMapping("/loginPage")
    public String showLoginPage() {
        return "/login/login-page";
    }

    @GetMapping("/accessDenied")
    public String showAccessDeniedPage() {
        return "/login/access-denied";
    }
}
