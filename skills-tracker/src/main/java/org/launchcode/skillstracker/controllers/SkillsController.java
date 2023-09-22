package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("/")
    public String skillController(){return "<html>" +
            "<body>" +
            "<h1>Skills Tracker<h1>"+
            "<h2>LaunchCode Skills<h2>" +
            "<ol>" +
            "<li>Java</li>"+
            "<li>JavaScript</li>"+
            "<li>Python</li>"+
            "</body>"+
            "</html>";}

    @GetMapping("/form")
    public String skillControllerForm(){
        return "<html>" +
                "<body>" +
                "<form>" +
                "<label for='name'>Name: </label>" +
                "<input type='text' name='name'>" +
                "<br><br>" +

                //Favorite Language
                "<label for='selection'>My favorite language:</label>"+
                "<select id='selection' name='option'>" +
                "<option value='option1'>Java</option>" +
                "<option value='option2'>JavaScript</option>" +
                "<option value='option3'>Python</option>" +
                "</select>" +
                "<br><br>"+


                //Second Favorite Language
                "<label for='selection2'>My Second language:</label>"+
                "<select id='secondSelection' name='secondSelectionOption'>" +
                "<option value='secondSelectionOption1'>Java</option>" +
                "<option value='secondSelectionOption2'>JavaScript</option>" +
                "<option value='secondSelectionOption3'>Python</option>" +
                "</select>" +
                "<br><br>"+

                //Third Favorite Language
                "<label for='selection3'>My Third language:</label>"+
                "<select id='thirdSelection' name='thirdSelectionOption'>" +
                "<option value='thirdSelectionOption1'>Java</option>" +
                "<option value='thirdSelectionOption2'>JavaScript</option>" +
                "<option value='thirdSelectionOption3'>Python</option>" +
                "</select>" +
                "<br><br>"+


                "</form>" +
                "</body>" +
                "</html>";



    }
}
