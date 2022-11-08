package com.Log.logerror.Controller;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Run/")

public class Controller 
{
	@RequestMapping(value="app", method=RequestMethod.GET)
	
	public ResponseEntity<?> aPP(@RequestParam Map<String,String> requestParams)
	{
		Logger log=LogManager.getLogger("logerror");
		

		log.debug("testAPI started: " + requestParams);
		log.info("testAPI started: " + requestParams);
		return new ResponseEntity<>(requestParams,HttpStatus.OK);
		
	}
} 
