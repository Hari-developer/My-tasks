package com.spring.Jdbc.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Jdbc.model.Customer;
import com.spring.Jdbc.repo.SqlConnectionDAO;




@RestController
@RequestMapping("/Jdbc/")
public class SqlConnectionController {

	@Autowired
	SqlConnectionDAO dao;

	@GetMapping(value = "Connect")
	public ResponseEntity<?> customerInformation() {

		List<Customer> customers = dao.Read();
		
		return new ResponseEntity<>(customers,HttpStatus.OK);
	}
}
