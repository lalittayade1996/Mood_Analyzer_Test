package com.bridgelabz.mood.Mood_Analyser;

public class MoodAnalyzer {
	public String message;

//	Constructor 
	public MoodAnalyzer() {
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String moodAnalyzer(String message) throws MoodAnalyzerException {
//		Exception
		try {

			if (message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";

		}
//		Null Point Exception
		catch (NullPointerException e) {
			throw new MoodAnalyzerException("You Have Passed A Null,PLEASE CHECK AGAIN");
		}
	}
}