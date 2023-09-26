package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

        //lives at the root path
        @GetMapping("/")
        public String skillsControllerRender (){
            return "<html>" +
                    "<head>" +
                    "<style>" +
                    "body {background-color: Beige}" +
                    "h1{color: #333}" +
                    "h2{color: #031}" +
                    "</style>" +
                    "</head>" +
                    "<body>" +
                    "<h1>Skills Tracker</h1>" +
                    "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                    "<ol>" +
                    "<li>Java </li>" +
                    "<li>JavaScript </li>" +
                    "<li>Python</li>" +
                    "</ol>" +
                    "</body>" +
                    "</html>";
        }

        @GetMapping("form")
        public String skillsControllerForm(){
            return "<html>" +
                    "<body>" +
                    "<form action='/form' method= 'POST'>" +
                    "<label>Name: </label>" +
                    "<input name='userName'/><br/><br/>" +

                    //Favorite Language
                    "<label>My favorite language</label><br/>" +
                    "<select name='favoriteLang1'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>"+
                    "</select><br/>"+

                    //Second Favorite Language
                    "<label>My second favorite language</label><br/>" +
                    "<select name='favoriteLang2'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                    "</select><br/>"+

                    //Third Favorite Language
                    "<label>My third favorite language</label><br/>" +
                    "<select name='favoriteLang3'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                    "</select><br/><br/>" +
                    "<input type='submit' value='Submit'/>"+

                    "</form>" +
                    "</body>" +
                    "</html>";
        }

        @RequestMapping("/form")
        public String processSkillsForm(@RequestParam String userName, String favoriteLang1, String favoriteLang2, String favoriteLang3 ){
            return "<html>" +
                    "<head>" +
                    "<style>" +
                    "body {background-color: Beige}" +
                    "h1{color: #333}" +
                    "h2{color: #031}" +
                    "</style>" +
                    "</head>" +
                    "<body>" +
                    "<h1>"+ userName + "</h1>" +
                    "<h2> Skills Tracker </h2>" +
                    "<p> Here are my favorite skills:"+ "</p>" +
                    "<ol>" +
                    "<li>" + favoriteLang1 + "</li>"+
                    "<li>" + favoriteLang2 + "</li>"+
                    "<li>" + favoriteLang3 + "</li>"+
                    "</ol>" +
                    "</body>" +
                    "</html>";
        }


}
