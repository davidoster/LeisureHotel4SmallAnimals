/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import models.QuizEntry;
import models.QuizEntryDTO;
import models.QuizEntryVisibility;
import org.springframework.stereotype.Service;

/**
 *
 * @author mac
 */
@Service
public class QuizServiceImpl implements IQuizService {
    private HashMap<String, QuizEntryDTO> entries;
    
//    @Autowired
//    IQuizService quizService;
    
    public QuizServiceImpl() {
        entries = new HashMap();
        QuizEntryDTO dto = new QuizEntryDTO();
        dto.setEntry(new QuizEntry("Alabama", "Montgomery", "Birmingham", "Yellowhammer", "Camellia"));
        dto.setVisibility(new QuizEntryVisibility(true, false, false, false, false));
        entries.put("Alabama", dto);
        
        dto = new QuizEntryDTO();
        dto.setEntry(new QuizEntry("Alaska", "Montgomery", "Birmingham", "Yellowhammer", "Camellia"));
        entries.put("Alaska", dto);
        
        dto = new QuizEntryDTO();
        dto.setEntry(new QuizEntry("Arizona", "Montgomery", "Birmingham", "Yellowhammer", "Camellia"));
        entries.put("Arizona", dto);
        
        dto = new QuizEntryDTO();
        dto.setEntry(new QuizEntry("Arkansas", "Montgomery", "Birmingham", "Yellowhammer", "Camellia"));
        entries.put("Arkansas", dto);
    }
    
    
    @Override
    public QuizEntryDTO singleQuizEntry(String state) {
        return(entries.get(state));
    }

    @Override
    public List<QuizEntryDTO> multiQuizEntries() {
        List<QuizEntryDTO> list = new ArrayList<>();
        for (QuizEntryDTO qdto : entries.values()) {
            list.add(qdto);
        }
        return list;
    }
}
