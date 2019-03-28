package edu.asu.diging.tutorial.spring.service;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.asu.diging.tutorial.spring.domain.Mood;
import edu.asu.diging.tutorial.spring.domain.MoodList;

@Component("happy")
public class HappyMood implements MoodService{

    public Mood getCurrentMood() {
        return new Mood("happy");
    }
    
    public String getExplanation(String mood){
    	return "He just had a redbull and can run more apps";
    }
}
