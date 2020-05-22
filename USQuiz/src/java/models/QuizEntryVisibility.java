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
public class QuizEntryVisibility {
    private boolean state;
    private boolean capital;
    private boolean largestCity;
    private boolean bird;
    private boolean flower;

    public QuizEntryVisibility(boolean state, boolean capital, boolean largestCity, boolean bird, boolean flower) {
        this.state = state;
        this.capital = capital;
        this.largestCity = largestCity;
        this.bird = bird;
        this.flower = flower;
    }

    
    
    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean isCapital() {
        return capital;
    }

    public void setCapital(boolean capital) {
        this.capital = capital;
    }

    public boolean isLargestCity() {
        return largestCity;
    }

    public void setLargestCity(boolean largestCity) {
        this.largestCity = largestCity;
    }

    public boolean isBird() {
        return bird;
    }

    public void setBird(boolean bird) {
        this.bird = bird;
    }

    public boolean isFlower() {
        return flower;
    }

    public void setFlower(boolean flower) {
        this.flower = flower;
    }
    
    
    
}
