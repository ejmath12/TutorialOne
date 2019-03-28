package edu.asu.diging.tutorial.spring.web;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.asu.diging.tutorial.spring.service.MoodService;
 
@Controller
public class HomeController {
 
    @Autowired 
    @Qualifier("random")
    private MoodService service;
 
    @RequestMapping(value = "/")
    public String home(ModelMap map) {
        map.addAttribute("mood", service.getCurrentMood());
        return "index";
    }
    
    @RequestMapping(value = "/why")
    public String someMethod(@RequestParam("mood") String mood, ModelMap map) {
     String reason = "";
     switch(mood) {
     case "happy": reason = "He just had a redbull and can run more apps";
     				break;

     case "sad": reason = "Apache just left him";
     				break;

     case "nuetral": reason = "He has remained the same for years, nothing new is happening in his life";
     				break;
     				default: reason ="I dont know what mood is this";
     }
     map.addAttribute("result", reason);
     return "whyPage";
    } 
}