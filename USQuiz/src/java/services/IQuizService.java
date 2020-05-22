/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import models.QuizEntry;

/**
 *
 * @author mac
 */

public interface IQuizService {
    QuizEntry singleQuizEntry(String state);
    
}
