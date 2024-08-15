package com.coderscampus.Assignment10.domain;
//MIHGT DELETE THIS CLASS AS IT DOES NOT SEEM NECESSARY ATM
//Represent meal plans
public class MealPlan {
	
	private String timeFrame;
	private Integer targetCalories;
	private String diet;
	private String exclude;
	
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
