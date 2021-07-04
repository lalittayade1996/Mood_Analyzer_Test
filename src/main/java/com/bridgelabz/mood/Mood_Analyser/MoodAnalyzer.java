package com.bridgelabz.mood.Mood_Analyser;


public class MoodAnalyzer {

	public String analyseMood(String message) {
		if (message.toLowerCase().contains("sad"))
			return "SAD";
		else 
			return "HAPPY";
	
		
		
//	public String analyseMood() {
//		String message = null;
//		if (message.toLowerCase().contains("sad"))
//			return "SAD";
//		else
//			return "HAPPY";
	}
}