package backend.controllers;

import backend.dto.userDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    String getHomePage(Model model){
        model.addAttribute(new userDto());
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

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ResponseEntity registerUser(){
        //TODO user dto
        //TODO userService
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
