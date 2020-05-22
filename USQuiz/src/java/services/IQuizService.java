/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import models.QuizEntry;
import models.QuizEntryDTO;

/**
 *
 * @author mac
 */

public interface IQuizService {
    QuizEntryDTO singleQuizEntry(String state);
    List<QuizEntryDTO> multiQuizEntries();
    
}
