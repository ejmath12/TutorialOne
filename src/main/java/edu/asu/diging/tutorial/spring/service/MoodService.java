package edu.asu.diging.tutorial.spring.service;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import edu.asu.diging.tutorial.spring.domain.Mood;
import edu.asu.diging.tutorial.spring.domain.MoodList;
 
@Service
public interface MoodService {
  
	public Mood getCurrentMood();
	
	public String getExplanation(String mood);
	
}