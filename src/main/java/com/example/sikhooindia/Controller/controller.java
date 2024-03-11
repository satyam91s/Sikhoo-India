package com.example.sikhooindia.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.sikhooindia.Beans.user;



@Controller
public class controller {

    @RequestMapping("/")
    public String home()
    {
        return "home";
    }
    
    @RequestMapping("/career")
    public String career()
    {
        return "career";
    }
    
    @RequestMapping("/quiz")
    public String quiz()
    {
        return "quiz";
    }
    
    @RequestMapping("/learn")
    public String lerning()
    {
        return "learn";
    }
    @RequestMapping("/home")
    public String loglearn()
    {
        return "index";
    }
    @RequestMapping("/login")
    public String login()
    {
        return "login";
    }
    
    @RequestMapping("/about")
    public String about()
    {
        return "about";
    }
    // @RequestMapping("/contact")
    // public String contact()
    // {
    //     return "contact";
    // }
    @GetMapping("/register")
    public String RegistrationForm(Model model) {
        model.addAttribute("user", new user());
        return "register";
    }
    @GetMapping("/com")
    public String com() {
        
        return "communication";
    }
   
}
