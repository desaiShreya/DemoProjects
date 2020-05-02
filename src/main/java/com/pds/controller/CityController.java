package com.pds.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pds.exception.RecordNotFoundException;
import com.pds.model.CityEntity;
import com.pds.service.CityService;
import java.util.List;

@RestController
public class CityController {
	
	   @Autowired
	    CityService service;
	   
	   @RequestMapping("/")
	   public String HelloWorld() {
		   System.out.println("inside controller functn");
		   return "Hello";
	   }
	 
	   @RequestMapping("/cities")
	    public ResponseEntity<List<CityEntity>> getAllStudents() {
		   
	        List<CityEntity> list = service.getAllStudents();
	 
	        return new ResponseEntity<List<CityEntity>>(list, new HttpHeaders(), HttpStatus.OK);
	    }
	   
	   @GetMapping("/{id}")
	    public ResponseEntity<CityEntity> getStudentById(@PathVariable("id") Long id)
	                                                    throws RecordNotFoundException {
	    	CityEntity entity = service.getCityById(id);
	 
	        return new ResponseEntity<CityEntity>(entity, new HttpHeaders(), HttpStatus.OK);
	    }

}
