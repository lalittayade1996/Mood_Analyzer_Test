package com.bridgelabz.mood.Mood_Analyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTest {
	@Test
	public void givenMood_WhenHappySad_ReturnMessage() throws MoodAnalyzerException {
		MoodAnalyzer moodTest = new MoodAnalyzer();
		String mood = moodTest.moodAnalyzer("I am in Sad Mood");
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() throws MoodAnalyzerException {
		MoodAnalyzer moodTest = new MoodAnalyzer();
		String mood = moodTest.moodAnalyzer("I am in Any Mood");
		Assert.assertEquals("HAPPY", mood);
	}

	@Test()
	public void givenNull_WhenNull_ThrowsException() {
		MoodAnalyzer moodTest = new MoodAnalyzer(null);
		try {
			moodTest.moodAnalyzer(null);
		} catch (MoodAnalyzerException e) {
			Assert.assertEquals(MoodAnalyzerException.exceptionType.nullInput, e.type);
		}
	}

	@Test
	public void givenEmpty_WhenEmpty_ThrowsException() {
		MoodAnalyzer moodTest = new MoodAnalyzer();
		try {
			moodTest.moodAnalyzer("");
		} catch (MoodAnalyzerException e) {
			Assert.assertEquals(MoodAnalyzerException.exceptionType.emptyInput, e.type);
		}
	}
}