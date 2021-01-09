package pl.sda.java.event.service.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
//    private LoginService loginService;

    @GetMapping("/login")
    public String showLoginForm(){
        return "loginForm";
    }
}
