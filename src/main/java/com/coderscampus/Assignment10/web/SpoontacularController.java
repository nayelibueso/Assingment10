package com.coderscampus.Assignment10.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Assignment10.domain.DayResponse;
import com.coderscampus.Assignment10.domain.WeekResponse;

//Class will handle requests related to the Spoontacular API
@RestController
public class SpoontacularController {
	@GetMapping("mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(String numCalories, String diet, String exclusions){
		
	}

	@GetMapping("mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(String numCalories, String diet, String exclusions){
		
	}
}
