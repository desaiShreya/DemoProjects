package com.pds.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.pds.Repository.CityRepository;
import com.pds.exception.RecordNotFoundException;
import com.pds.model.CityEntity;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {
	
	 @Autowired
	   CityRepository repository;
	 
	
	 public List<CityEntity> getAllStudents()
	    {
	        List<CityEntity> studentList = repository.findAll();
	         
	        if(studentList.size() > 0) {
	            return studentList;
	        } else {
	            return new ArrayList<CityEntity>();
	        }
	    }
	 
	 public CityEntity getCityById(Long id) throws RecordNotFoundException
	    {
	        Optional<CityEntity> city = repository.findById(id);
	         
	        if(city.isPresent()) {
	            return city.get();
	        } else {
	            throw new RecordNotFoundException("No student record exist for given id",id);
	        }
	    }

}
