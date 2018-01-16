package com.smartict.testaction;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport{
	private Show_model myModel;
	
	
	public String doSomething(){
		return SUCCESS;
	}
	public String getName(){
		return SUCCESS;
	}
	
	

	public Show_model getMyModel() {
		return myModel;
	}
	public void setMyModel(Show_model myModel) {
		this.myModel = myModel;
	}
	
	
}
