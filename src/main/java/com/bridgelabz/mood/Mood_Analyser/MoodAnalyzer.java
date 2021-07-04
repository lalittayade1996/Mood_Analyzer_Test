package com.bridgelabz.mood.Mood_Analyser;

public class MoodAnalyzer {
	public String message;

	public MoodAnalyzer() {
	}

	public MoodAnalyzer(String message) {
		this.message = message;
	}

	public String moodAnalyzer(String message) {
		try {

			if (message.contains("Sad"))
				return "SAD";
			else
				return "HAPPY";

		} catch (NullPointerException e) {
			return "True";
		}
	}
}