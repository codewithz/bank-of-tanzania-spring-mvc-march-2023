package tz.go.bot.conference.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String greeting(Map<String,Object> model){
        model.put("message","Hello Zartab");
        return "greeting";
    }

    @GetMapping("name")
    public String sayHelloToName(Map<String,Object> model){
        model.put("name","Bank of Tanzania");
        return "name";

    }

}
