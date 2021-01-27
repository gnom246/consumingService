package pl.sda.java26.eventconsuming.controller;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import pl.sda.java26.eventconsuming.dto.EventDto;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/ext")
public class ExtEventController {

    private final RestTemplate restTemplate;

    public ExtEventController(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @GetMapping("/events")
    String getEventsFromAPI(Model model){
        List <EventDto> events = restTemplate.getForObject("http://localhost:8070/api/events", List.class);
        model.addAttribute("events", events);
        return "events";
    }

}
