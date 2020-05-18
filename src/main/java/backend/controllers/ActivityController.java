package backend.controllers;

import backend.model.cardDTO;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Random;

@Controller
public class ActivityController {

    private ArrayList<String> cards = new ArrayList<>();

    @RequestMapping(value = "/activityget", method = RequestMethod.POST)
    public ResponseEntity getActivityget(@RequestParam(name="activityName") String name){
        //Unacceptable inputs (406)
        if(name.equals("") || name.length()<2) {
            return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
        }
        //Maximum allowed length is 35 characters (413)
        if(name.length()>35){
            return new ResponseEntity(HttpStatus.PAYLOAD_TOO_LARGE);
        }
        //List has a max size of 50. answer if list is full (507)
        if(cards.size() == 50){
            return new ResponseEntity(HttpStatus.INSUFFICIENT_STORAGE);
        }
        //List already contains input (503)
        if(cards.contains(name)){
            return new ResponseEntity(HttpStatus.SERVICE_UNAVAILABLE);
        }
        cards.add(name);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/getCard", method = RequestMethod.GET)
    public String isItCool(Model model){
        String given = cards.get(new Random().nextInt(cards.size()));
        model.addAttribute("message", given);
        return "getCard";
    }

    @RequestMapping(value = "getComment", method = RequestMethod.GET)
    public String getListSize(Model model){
        model.addAttribute("robotComment", "tesztsajt");
        return "getComment";
    }

    @RequestMapping(value = "/activity", method = RequestMethod.GET)
    public String getActivity(){
        return "activity";
    }
}
