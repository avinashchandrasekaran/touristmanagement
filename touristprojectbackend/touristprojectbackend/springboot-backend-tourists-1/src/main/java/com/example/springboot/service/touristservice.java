package com.example.springboot.service;

import java.util.List;

import com.example.springboot.model.touristmodel;

public interface touristservice {

	touristmodel saveTourist(touristmodel tourist);

	List<touristmodel> getAllTourists();

	List<touristmodel> findAllByOrderByFirstNameDesc();

	

}
