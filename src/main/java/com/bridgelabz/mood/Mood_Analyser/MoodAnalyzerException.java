package com.bridgelabz.mood.Mood_Analyser;

public class MoodAnalyzerException extends Exception {
	public exceptionType type;

	public MoodAnalyzerException(exceptionType type, String message) {
		super(message);
		this.type = type;
	}

	public enum exceptionType {
		nullInput, emptyInput

	}
}
