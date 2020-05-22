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
public class QuizEntry {
    private String state;
    private String capital;
    private String largestCity;
    private String bird;
    private String flower;

    public QuizEntry(String state, String capital, String largestCity, String bird, String flower) {
        this.state = state;
        this.capital = capital;
        this.largestCity = largestCity;
        this.bird = bird;
        this.flower = flower;
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLargestCity() {
        return largestCity;
    }

    public void setLargestCity(String largestCity) {
        this.largestCity = largestCity;
    }

    public String getBird() {
        return bird;
    }

    public void setBird(String bird) {
        this.bird = bird;
    }

    @Override
    public String toString() {
        return "QuizEntry{" + "state=" + state + ", capital=" + capital + ", largestCity=" + largestCity + ", bird=" + bird + ", flower=" + flower + '}';
    }
    
    
    
    
}
