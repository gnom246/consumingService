package pl.sda.java.event.service.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.sda.java.event.service.dto.CorrectUserDataDto;
import pl.sda.java.event.service.dto.RegisteredUserDto;
import pl.sda.java.event.service.services.UserService;

import javax.validation.Valid;

@Controller
public class RegisterController {
    private final UserService userService;

    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String showRegisterForm() {
        return "registrationForm";
    }

    @PostMapping("/register")
    public String submitRegisterForm(@Valid CorrectUserDataDto correctUserDataDto,
                                     @RequestParam String email,
                                     @RequestParam String nickname,
                                     @RequestParam String password) {

        RegisteredUserDto registeredUserDto = userService.registerUser(email, nickname, password);
        return "redirect:/";
    }
}
