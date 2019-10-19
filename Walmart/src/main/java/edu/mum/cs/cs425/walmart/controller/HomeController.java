package edu.mum.cs.cs425.walmart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/","/eWalmart", "/eWalmart/home"})
    public String home() {
        return "home/index";
    }

}
