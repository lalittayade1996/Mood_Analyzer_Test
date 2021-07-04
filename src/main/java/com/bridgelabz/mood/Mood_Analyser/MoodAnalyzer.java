package com.bridgelabz.mood.Mood_Analyser;

public class MoodAnalyzer {
    public String moodAnalyzer(String message){
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }

}