package com.samples.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.samples.model.Activity;
import com.samples.service.ActivityService;
import com.samples.vo.MessageVO;

@Controller
public class HelloWorldController {

	@Autowired
	ActivityService activityService1;
	
	@RequestMapping(value="/init", method=RequestMethod.GET)
    public String showMessage(@ModelAttribute("message") MessageVO message) {
    	System.out.println("In show Message :" + message.getWelcomeMsg());
    	
    	//map.addAttribute("UserMessage", message);
    	
    	return "index";
    }

	@RequestMapping(value="/init", method=RequestMethod.POST)
    public String showUserMessage(@Valid @ModelAttribute("message") MessageVO message, BindingResult result) {
    	
		System.out.println("Result has errors :" + result.hasErrors());
		
		if(result.hasErrors()) {
			System.out.println("Returing to Index page...");
			return "index";
		}
		
		System.out.println("User message :" + message.getWelcomeMsg());
    	return "userMessage";
    }
	
	@RequestMapping(value="/activities", method=RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {
		
		return activityService1.findAllActivities();
		
	}
	
}
