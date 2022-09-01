package com.example.RestApiTask;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class RestApiServices {
	
	private static List<String> arrayNames=new ArrayList<String>();  
	
	// this method is used for getting the data history from array list
	public static String findAllHistory() throws JsonProcessingException {
		
		ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(arrayNames);
		return json;
		
	}
	
	//this method is used for getting the previous updated data from array list
	public static String findLastName() {
		int val = 0; 
		if(arrayNames.size() ==1) {
			return "{output:"+null+"}";
		}else {
			val = arrayNames.size()-2;
			return "{output:"+arrayNames.get(val)+"}";
		}		
		
	}
	
	// this method is used for adding name to the array list
	public static Track addName (Track track2) {
		
		arrayNames.add(track2.getName());
		return track2;		
		
	}

}



