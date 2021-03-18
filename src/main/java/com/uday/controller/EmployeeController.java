package com.uday.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uday.exception.RecordNotFoundException;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/getAll")
	public ResponseEntity<?> getAllEmployees(){
		throw new RecordNotFoundException("Invalid employee id : ");
	}
	
	@GetMapping("/getAll/{id}")
	public ResponseEntity<?> getEmployee(String id){
		throw new RecordNotFoundException("Invalid employee id : "+id);
	}
	
	
}
