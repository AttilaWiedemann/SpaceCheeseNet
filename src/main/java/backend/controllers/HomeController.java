package backend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    String getHomePage(){
        return "login";
    }

    @RequestMapping(value = "/techDetails", method = RequestMethod.GET)
    public String getTechDetailsPage(){
        return "techDetails";
    }

    @RequestMapping(value = "/gdpr", method = RequestMethod.GET)
    public String getGdpr(){
        return "gdpr";
    }

    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String getContact(){
        return "contact";
    }
}
