package come.finalexam.wallymartsupperstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {
    @GetMapping(value = {"/","/eCustomer","/eCustomer/homepage"})
    public  String homepage(){
        return "homepage/index";
    }
}
