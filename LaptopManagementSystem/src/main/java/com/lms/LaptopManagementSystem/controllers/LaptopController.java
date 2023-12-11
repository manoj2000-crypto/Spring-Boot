package com.lms.LaptopManagementSystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.LaptopManagementSystem.entity.Laptop;
import com.lms.LaptopManagementSystem.serviceImpl.LaptopServiceImpl;

@RestController 
@RequestMapping("/laptopmanagementsystem.com")
public class LaptopController {
	
	@Autowired
	private LaptopServiceImpl laptopServiceImpl;

	@GetMapping("/{laptopId}")
	Laptop readByLaptopId(@PathVariable int laptopId) 
	{
		return laptopServiceImpl.readLaptopFromDb(laptopId);
	}
	
	@GetMapping("/readAllLaptop")
	List<Laptop> getAllLatopsFromDb()
	{
		return laptopServiceImpl.readAllDetailsFromDB();
	}
	
	@PostMapping("/addLaptop")
	Laptop addLaptopToDb(@RequestBody Laptop laptopObj) 
	{
		return laptopServiceImpl.addLaptopDetails(laptopObj);
	}
	
	@PutMapping("/updateLaptop/{primaryKey}")
	void updatelaptopDetails(@PathVariable("primaryKey") int laptopId, @RequestBody Laptop newLaptopValue) 
	{
		laptopServiceImpl.updateLaptopDetails(laptopId, newLaptopValue);
	}
	
	@DeleteMapping
	void deleteAllStudents() {
		laptopServiceImpl.deleteLaptops();
	}
	
	@DeleteMapping("/deleteLaptop/{laptopId}")
	void deleteLaptop(@PathVariable("id") int deleteLaptopId) 
	{
		laptopServiceImpl.deleteLaptopById(deleteLaptopId);
	}
	
}