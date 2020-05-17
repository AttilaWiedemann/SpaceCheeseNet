package backend.controllers;

import backend.model.cardDTO;
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
        cards.add(name);
        System.out.println(name + " added");
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/getCard", method = RequestMethod.GET)
    public String isItCool(Model model){
        String given = cards.get(new Random().nextInt(cards.size()));
        model.addAttribute("message", given);
        return "getCard";
    }

    @RequestMapping(value = "/activity", method = RequestMethod.GET)
    public String getActivity(){
        return "activity";
    }
}
