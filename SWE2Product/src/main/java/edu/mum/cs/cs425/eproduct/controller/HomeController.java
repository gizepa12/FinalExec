package edu.mum.cs.cs425.eproduct.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/","/eMarket", "/eMarket/home"})
    public String home() {
        return "home/index";
    }

}
