package com.example.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.model.touristmodel;



@Repository
public interface TouristRepository extends JpaRepository<touristmodel,Integer>{
	
	List<touristmodel> findAllByOrderByFirstNameDesc();

}

