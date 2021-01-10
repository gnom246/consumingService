package pl.sda.java.event.service.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.sda.java.event.service.services.LoginService;


@Controller
public class HomePageController {

    private final LoginService loginService;

    public HomePageController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/")
    public String showHomePage(Model model){
        model.addAttribute("userLogged", loginService.isLogged());
        model.addAttribute("userInfo", loginService.getUserSessionDto());

        return "homePage";
    }
}
