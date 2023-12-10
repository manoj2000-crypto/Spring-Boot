package com.lms.LaptopManagementSystem.services;

import java.util.List;

import com.lms.LaptopManagementSystem.entity.Laptop;

public interface LaptopActions {
	
	Laptop addLaptopDetails(Laptop laptopObj);
	List<Laptop> readAllDetailsFromDB();

}
 