package com.EmpManagement.login.EMP.controller;

import com.EmpManagement.login.EMP.service.UserService;
import com.EmpManagement.login.EMP.web.web.dto.UserRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class userRegistrationController {
    private UserService userService;

    public userRegistrationController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public String showRegistrationForm(){
        return "/registration";
    }
@PostMapping
    public String registerUserAccount(@ModelAttribute("user")UserRegistration userRegistration){
        userService.save(userRegistration);
        return "redirect:/registration?success";
    }
}
