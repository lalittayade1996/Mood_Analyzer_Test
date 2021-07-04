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

	@SuppressWarnings("deprecation")
	@Test()
	public void givenNull_WhenNull_ThrowsException() {
		MoodAnalyzer moodTest = new MoodAnalyzer(null);
		try {
			ExpectedException exceptionRule = ExpectedException.none();
			exceptionRule.expect(MoodAnalyzerException.class);
			String mood = moodTest.moodAnalyzer(null);
			Assert.assertEquals("NULL", mood);
		} catch (MoodAnalyzerException e) {
			e.printStackTrace();
		}
	}

}