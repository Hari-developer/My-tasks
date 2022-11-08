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
@RequestMapping("/api/")

public class Controller2 {

	@RequestMapping(value = "runapi", method = RequestMethod.GET)

	public ResponseEntity<?> runAPI(@RequestParam Map<String, String> requestParams) {
		Logger log = LogManager.getLogger("logerror2");

		log.debug("Controller 2 Started: " + requestParams);
		log.info("Controller 2 Started: " + requestParams);
		return new ResponseEntity<>(requestParams, HttpStatus.OK);

	}
}
