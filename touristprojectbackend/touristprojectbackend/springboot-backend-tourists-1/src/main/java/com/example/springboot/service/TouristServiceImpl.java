package com.example.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.model.touristmodel;
import com.example.springboot.repository.TouristRepository;



@Service
public class TouristServiceImpl implements touristservice{

	@Autowired
	private TouristRepository touristRepo;
	


	public touristmodel saveTourist(touristmodel tourist) {
		return touristRepo.save(tourist);
	}
	public List<touristmodel> getAllTourists() {
		return touristRepo.findAll();
	}
	public List<touristmodel> findAllByOrderByFirstNameDesc() {
		return touristRepo.findAllByOrderByFirstNameDesc();
	}
}