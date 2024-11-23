package com.scm.com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home page handler");
        //sendig data to view
        model.addAttribute("name", "Muskan");
        model.addAttribute("github", "https://github.com/muskangupta042002/");
        return "home";
    }
}
