/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import models.QuizEntry;
import models.QuizEntryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import services.IQuizService;
import services.QuizServiceImpl;


/**
 *
 * @author mac
 */
@Controller
//@RequestMapping(value="/Quiz", method=RequestMethod.GET)
@RequestMapping("/Quiz")
public class Quiz {
    @Autowired
    private IQuizService quizService;
    
    public Quiz() {
    
    }
    
    @RequestMapping("/show")
    public String show(ModelMap view) {
        IQuizService qs = new QuizServiceImpl();
        QuizEntryDTO entry = qs.singleQuizEntry("Alabama");
        view.addAttribute("qentry", entry);
        return "quiz";
    }
    
    @RequestMapping("/showall")
    public String showAll(ModelMap view) {
        IQuizService qs = new QuizServiceImpl();
        List<QuizEntryDTO> qdto = qs.multiQuizEntries();
        view.addAttribute("dtos", qdto);
        return "quizzes";
    }
    
    
}
