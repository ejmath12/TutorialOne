package edu.asu.diging.tutorial.spring.service;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.asu.diging.tutorial.spring.domain.Mood;
import edu.asu.diging.tutorial.spring.domain.MoodList;

@Component("random")
public class RandomMood implements MoodService {
	@Autowired 
	private MoodList ml;
	
	@PostConstruct
    public Mood getCurrentMood() {
        Mood m1 = new Mood("happy");
        Mood m2 = new Mood("sad");
        Mood m3 = new Mood("nuetral");
        ml.setMoodList(Arrays.asList(m1,m2,m3));
        return ml.getRandomMood();       
    }
}
