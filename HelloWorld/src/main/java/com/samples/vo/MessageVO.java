package com.samples.vo;

import org.hibernate.validator.constraints.Range;

public class MessageVO {
	
	private String welcomeMsg ="How are you today?";
	
	@Range(min=1, max=50)
	private int count;
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getWelcomeMsg() {
		return welcomeMsg;
	}

	public void setWelcomeMsg(String welcomeMsg) {
		this.welcomeMsg = welcomeMsg;
	}
	
	

}
