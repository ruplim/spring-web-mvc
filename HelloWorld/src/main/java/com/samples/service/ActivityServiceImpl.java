package com.samples.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.samples.model.Activity;

@Service("activityService")
public class ActivityServiceImpl implements ActivityService  {


	public List<Activity> findAllActivities() {
		
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run1");
		activities.add(run);
		
		Activity run1 = new Activity();
		run1.setDesc("Bike");
		activities.add(run1);
		
		Activity run2 = new Activity();
		run2.setDesc("Swim");
		activities.add(run2);
		
		return activities;

	}
}
