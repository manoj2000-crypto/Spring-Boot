package com.lms.LaptopManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.LaptopManagementSystem.entity.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
	
}