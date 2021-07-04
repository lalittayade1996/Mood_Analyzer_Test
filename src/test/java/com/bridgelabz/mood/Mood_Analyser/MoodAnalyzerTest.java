package com.bridgelabz.mood.Mood_Analyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
	@Test
	public void givenMood_WhenHappySad_ReturnMessage() {
		MoodAnalyzer moodTest = new MoodAnalyzer();
		String mood = moodTest.moodAnalyzer("I am in Sad Mood");
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() {
		MoodAnalyzer moodTest = new MoodAnalyzer();
		String mood = moodTest.moodAnalyzer("I am in Any Mood");
		Assert.assertEquals("HAPPY", mood);
	}

	@Test
	public void givenNull_WhenNull_ThrowsException() {
		MoodAnalyzer moodTest = new MoodAnalyzer();
		String mood = moodTest.moodAnalyzer(null);
		Assert.assertEquals("HAPPY", mood);
	}
}