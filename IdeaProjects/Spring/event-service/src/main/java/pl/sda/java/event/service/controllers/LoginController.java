package pl.sda.java.event.service.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.sda.java.event.service.services.LoginService;

@Controller
public class LoginController {
    private LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/login")
    public String showLoginForm(){
        return "loginForm";
    }

    @PostMapping("/login-submit-data")
    public String submitLoginForm(@RequestParam String email,
                                  @RequestParam String password){
        try {
            loginService.loginUser(email, password);
        } catch (Exception e) {
            return "redirect:/login";
        }

        return "redirect:/users-by-email?email=tt";
    }
}
