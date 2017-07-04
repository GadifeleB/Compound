package com.example.brenda.compound;

import static android.R.attr.x;

public class CompundClass {

    //Question
    public String[] question = {
            "Used to carry things?",
            "A plant that moves with the sun?",
            "One item that every car has?",
            "Used to clean teeth?",
            "Used to travel long distance?",
            "uniquely identify items in store?",
            "it cries when its hot?",
            "It has 7 colours and found in the sky?",
    };

    public String possibleAnswer[][] ={
            {"Paper","Keeper","Bag"},
            {"Line","Flower","Sun"},
            {"Belt","Seat","Way"},
            {"Tooth","Dish","Brush"},
            {"Craft","Air","Fish"},
            {"Bar","Basket","Code"},
            {"Candle","Baby","Stick"},
            {"Rain","Coat","Bow"},
    };

    public String correctAnswer[][] ={
            {"Paper","Bag"},
            {"Flower","Sun"},
            {"Belt","Seat"},
            {"Tooth","Brush"},
            {"Craft","Air"},
            {"Bar","Code"},
            {"Candle","Stick"},
            {"Rain","Bow"},
    };

    public String getQuestion(int x) {
        String ques = question[x];
        return  ques;
    }

    public String getPossibleAnswer1(int x) {
        String pAnser = possibleAnswer[x][0];
        return pAnser;
    }

    public String getPossibleAnswer2(int x) {
        String pAnser = possibleAnswer[x][1];
        return pAnser;
    }

    public String getPossibleAnswer3(int x) {
        String pAnser = possibleAnswer[x][2];
        return pAnser;
    }

    public String getCorrectAnswer1(int x) {
        String cAnser = correctAnswer[x][0];
        return cAnser;
    }

    public String getCorrectAnswer2(int x) {
        String cAnser = correctAnswer[x][1];
        return cAnser;
    }

}
