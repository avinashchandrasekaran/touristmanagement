package com.example.springboot.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.touristmodel;
import com.example.springboot.service.touristservice;




@RestController
@RequestMapping("/api/tourist")
public class touristcontroller {
	@Autowired
	private touristservice service;

	
	@PostMapping("/add")
	public ResponseEntity<touristmodel> saveTourist(@RequestBody touristmodel tourist){
		return new ResponseEntity<touristmodel>(service.saveTourist(tourist), HttpStatus.CREATED);
	}
	@GetMapping
	public List<touristmodel> getAllTourists(){
		return service.getAllTourists();
	}
	@GetMapping("/firstname")
	public List<touristmodel> findAllByOrderByFirstNameDesc(){
		return service.findAllByOrderByFirstNameDesc();
	}
}
	
	
