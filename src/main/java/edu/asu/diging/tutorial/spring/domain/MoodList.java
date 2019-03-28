package edu.asu.diging.tutorial.spring.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class MoodList {
	private List<Mood> moodList;

	public List<Mood> getMoodList() {
		return moodList;
	}

	public void setMoodList(List<Mood> moodList) {
		this.moodList = moodList;
	}
	
	public MoodList() {
		moodList = new ArrayList<>();
	}
	
	public Mood getRandomMood() {
		Random rand = new Random(); 
		int rand_index = rand.nextInt(moodList.size());
		return moodList.get(rand_index);
	}
}
