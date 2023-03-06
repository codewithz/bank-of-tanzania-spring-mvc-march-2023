package tz.go.bot.conference.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import tz.go.bot.conference.model.Registration;

import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration")Registration registration){
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(
            @ModelAttribute("registration") Registration registration,
            Map<String,Object> model
    ){
        System.out.println("Registration: "+registration.getName());
        model.put("name",registration.getName());
        return "registration-success";
    }
}
