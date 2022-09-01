package com.example.RestApiTask;

public class Track {
	
	
	public Track() {
		
	}
	
	public Track(String name) {
		this.input = name;
		
	}
	
	private String input;

	public String getName() {
		return input;
	}

	public void setName(String name) {
		this.input = name;
	}
	
	

}
