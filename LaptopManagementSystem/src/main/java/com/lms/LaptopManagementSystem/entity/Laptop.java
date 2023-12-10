package com.lms.LaptopManagementSystem.entity;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@DynamicUpdate
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer laptopId;
	
	@Column(nullable = false)
	private String laptopName;
	private Float laptopPrice;
	
	@Column(unique = true, nullable = false)
	private Long laptopSerialNumber;
	private Boolean laptopWarrantyStatus;

	public Laptop() 
	{
		
	}
	
	public Laptop(String laptopName, Float laptopPrice, Long laptopSerialNumber,
			Boolean laptopWarrantyStatus) {
		super();
		//this.laptopId = laptopId;
		this.laptopName = laptopName;
		this.laptopPrice = laptopPrice;
		this.laptopSerialNumber = laptopSerialNumber;
		this.laptopWarrantyStatus = laptopWarrantyStatus;
	}

	public Integer getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(Integer laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public Float getLaptopPrice() {
		return laptopPrice;
	}

	public void setLaptopPrice(Float laptopPrice) {
		this.laptopPrice = laptopPrice;
	}

	public Long getLaptopSerialNumber() {
		return laptopSerialNumber;
	}

	public void setLaptopSerialNumber(Long laptopSerialNumber) {
		this.laptopSerialNumber = laptopSerialNumber;
	}

	public Boolean getLaptopWarrantyStatus() {
		return laptopWarrantyStatus;
	}

	public void setLaptopWarrantyStatus(Boolean laptopWarrantyStatus) {
		this.laptopWarrantyStatus = laptopWarrantyStatus;
	}

}