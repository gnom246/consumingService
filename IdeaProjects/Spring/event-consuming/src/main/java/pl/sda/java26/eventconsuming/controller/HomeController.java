package pl.sda.java26.eventconsuming.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/")
    public String showHomePage(){
        return "homePage";
    }
}
