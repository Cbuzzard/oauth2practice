package com.buzzardsview.oauth2practice.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Kim {

    @Id
    @GeneratedValue
    private int id;
    private int wieght;
    private String mood;
    private int hungerOutOfTen;

    public Kim(int wieght, String mood, int hungerOutOfTen) {
        this.wieght = wieght;
        this.mood = mood;
        this.hungerOutOfTen = hungerOutOfTen;
    }

    public Kim() {
    }

    public int getWieght() {
        return wieght;
    }

    public void setWieght(int wieght) {
        this.wieght = wieght;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public int getHungerOutOfTen() {
        return hungerOutOfTen;
    }

    public void setHungerOutOfTen(int hungerOutOfTen) {
        this.hungerOutOfTen = hungerOutOfTen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
