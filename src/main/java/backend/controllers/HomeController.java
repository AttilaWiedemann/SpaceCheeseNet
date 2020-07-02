package backend.controllers;

import backend.dto.userDto;
import backend.model.ActivityCard;
import backend.model.cardDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ResponseEntity registerUser(){
        //TODO user dto
        //TODO userService
    	System.out.println("megy ezz?");
        return new ResponseEntity(HttpStatus.OK);
    }
}
