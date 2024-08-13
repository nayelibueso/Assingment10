package com.coderscampus.Assignment10.domain;

//Represent meal plans
public class MealPlan {
	String timeFrame;
	Integer targetCalories;
	String diet;
	String exclude;
	public String getTimeFrame() {
		return timeFrame;
	}
	public void setTimeFrame(String timeFrame) {
		this.timeFrame = timeFrame;
	}
	public Integer getTargetCalories() {
		return targetCalories;
	}
	public void setTargetCalories(Integer targetCalories) {
		this.targetCalories = targetCalories;
	}
	public String getDiet() {
		return diet;
	}
	public void setDiet(String diet) {
		this.diet = diet;
	}
	public String getExlude() {
		return exclude;
	}
	public void setExlude(String exlude) {
		this.exclude = exlude;
	}
	
	

}
