package com.coderscampus.Assignment10.service;

import java.net.URI;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.Assignment10.domain.DayResponse;
import com.coderscampus.Assignment10.domain.WeekResponse;
//Handle the logic for calling the Spoontacular API to fetch meal plans based on parameters.
@Service
public class MealPlanService {
	
	private static final String API_BASE_URL = "https://api.spoonacular.com/mealplanner/generate";
	private static final String API_KEY = "1c039f06ddb0400d9c0d5034a2e09597";
	
	public WeekResponse getWeekMeals (String targetCalories, String diet, String exclusions ) {
		//Construct the URI with query params 
		URI uri = UriComponentsBuilder.fromHttpUrl(API_BASE_URL)
										.queryParam("timeFrame", "week")
										.queryParam("targetCalories", targetCalories)
										.queryParam("diet", diet)
										.queryParam("exclude", exclusions)
										.queryParam("apiKey", API_KEY)
										.build()
										.toUri();
		//Print URI for debugging 
	    System.out.println("Constructed URI: " + uri);
	    //Make API request
		RestTemplate rt = new RestTemplate();
		WeekResponse response = rt.getForObject(uri, WeekResponse.class);
		return response;
		
	}
	
	public DayResponse getDayMeals (String targetCalories, String diet, String exclusions) {
		URI uri = UriComponentsBuilder.fromHttpUrl(API_BASE_URL)
										.queryParam("timeFrame", "day")
										.queryParam("targetCalories", targetCalories)
										.queryParam("diet", diet)
										.queryParam("exclude", exclusions)
										.queryParam("apiKey", API_KEY)
										.build()
										.toUri();
		RestTemplate rt = new RestTemplate();
		DayResponse response = rt.getForObject(uri, DayResponse.class);
		return response;
	}
}
