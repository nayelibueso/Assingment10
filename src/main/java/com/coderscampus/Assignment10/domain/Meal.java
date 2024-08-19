package com.coderscampus.Assignment10.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

//A list of 'Meal' objects, each representing an individual meal in the plan.
public class Meal {

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("title")
	private String title;

	@JsonProperty("imageType")
	private String imageType;

	@JsonProperty("readyInMinutes")
	private Integer readyInMinutes;

	@JsonProperty("servings")
	private Integer servings;

	@JsonProperty("sourceUrl")
	private String sourceUrl;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public Integer getReadyInMinutes() {
		return readyInMinutes;
	}

	public void setReadyInMinutes(Integer readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}

	public Integer getServings() {
		return servings;
	}

	public void setServings(Integer servings) {
		this.servings = servings;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

}
