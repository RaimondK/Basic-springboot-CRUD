package com.raimis.loginCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private EmployeeController employeeController;

    @Autowired
    public HomeController(EmployeeController employeeController) {
        this.employeeController = employeeController;
    }

    @GetMapping("/")
    public String showHomePage(Model model) {
        return employeeController.listEmployees(model);
    }
}
