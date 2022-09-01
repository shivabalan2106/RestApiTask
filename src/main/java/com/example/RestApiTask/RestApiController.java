package com.example.RestApiTask;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;


@RestController
public class RestApiController {

	@Autowired
	RestApiServices restApiService;

	// this method is used for add a input name to object and returns previous input value
	  @PostMapping("/track/trackValue")
	  public String addName(@RequestBody Track track) {
	  RestApiServices.addName(track); 
	  return RestApiServices.findLastName();
	  }
	 
	  // this method is used for returning list of the existing data
	@GetMapping("/track/getHistory")
	public String getAllHistory() throws JsonProcessingException {
		return RestApiServices.findAllHistory();
	}


}
