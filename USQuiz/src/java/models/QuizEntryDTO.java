/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author mac
 */
public class QuizEntryDTO {
    private QuizEntry entry;
    private QuizEntryVisibility visibility;

    public QuizEntryDTO() {
    }

    public QuizEntryDTO(QuizEntry entry, QuizEntryVisibility visibility) {
        this.entry = entry;
        this.visibility = visibility;
    }

    public QuizEntry getEntry() {
        return entry;
    }

    public void setEntry(QuizEntry entry) {
        this.entry = entry;
    }

    public QuizEntryVisibility getVisibility() {
        return visibility;
    }

    public void setVisibility(QuizEntryVisibility visibility) {
        this.visibility = visibility;
    }
    
    
    
}
