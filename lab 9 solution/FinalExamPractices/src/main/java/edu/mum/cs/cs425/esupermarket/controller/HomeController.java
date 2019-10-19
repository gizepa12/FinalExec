package edu.mum.cs.cs425.esupermarket.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/","/esuperMarket" ,"esuperMarket/home"})
    public String home() {
        return "home/index";
    }
}
