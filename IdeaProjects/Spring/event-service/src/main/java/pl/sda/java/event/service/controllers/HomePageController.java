package pl.sda.java.event.service.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomePageController {

    @GetMapping("/")
    public String showHomePage(){
        return "homePage";
    }
}
