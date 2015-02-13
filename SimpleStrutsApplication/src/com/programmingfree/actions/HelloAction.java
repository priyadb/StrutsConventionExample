package com.programmingfree.actions;

import com.opensymphony.xwork2.Action;


public class HelloAction implements Action {

	private String greeting;
	@Override
	public String execute() throws Exception {
		setGreeting("Hello World - Struts2 Example by Priya!!");
		return SUCCESS;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public String getGreeting() {
		return greeting;
	}

}
