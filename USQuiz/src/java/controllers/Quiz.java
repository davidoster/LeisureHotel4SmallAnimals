/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 *
 * @author mac
 */
@Controller
//@RequestMapping(value="/Quiz", method=RequestMethod.GET)
@RequestMapping("/Quiz")
public class Quiz {
    
    public Quiz() {
    }
    
    @RequestMapping("/show")
    public String show() {
        
        return "quiz";
    }
    
    
}
