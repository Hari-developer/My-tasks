package com.Log.logerror;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.Log.logerror")
public class LogerrorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogerrorApplication.class, args);
	}

}
