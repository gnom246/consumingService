package pl.sda.consumingService.consumingService.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/")
    public String showHomePage(){
        return "homePage";
    }
}
