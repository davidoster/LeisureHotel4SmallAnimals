/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.HashMap;
import java.util.List;
import models.QuizEntry;

/**
 *
 * @author mac
 */
public class QuizServiceImpl implements IQuizService {
    private HashMap<String, QuizEntry> entries;
    
    public QuizServiceImpl() {
        entries = new HashMap();
        entries.put("Alabama", new QuizEntry("Alabama", "Montgomery", "Birmingham", "Yellowhammer", "Camellia"));
        entries.put("Alaska", new QuizEntry("Alaska", "Montgomery", "Birmingham", "Yellowhammer", "Camellia"));
        entries.put("Arizona", new QuizEntry("Arizona", "Montgomery", "Birmingham", "Yellowhammer", "Camellia"));
        entries.put("Arkansas", new QuizEntry("Arkansas", "Montgomery", "Birmingham", "Yellowhammer", "Camellia"));
    }
    
    
    @Override
    public QuizEntry singleQuizEntry(String state) {
        return(entries.get(state));
    }
    
}
