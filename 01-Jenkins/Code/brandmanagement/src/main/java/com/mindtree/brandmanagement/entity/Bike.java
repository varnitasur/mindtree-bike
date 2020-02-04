package com.mindtree.brandmanagement.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Bike {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bikeId;
	private String bikeName;
	private int bikePrice;
	@ManyToOne(cascade = CascadeType.ALL)
	 private Brand brand;
	public Bike() {
		super();
	}
	public Bike(int bikeId, String bikeName, int bikePrice, Brand brand) {
		super();
		this.bikeId = bikeId;
		this.bikeName = bikeName;
		this.bikePrice = bikePrice;
		this.brand = brand;
	}
	public int getBikeId() {
		return bikeId;
	}
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public int getBikePrice() {
		return bikePrice;
	}
	public void setBikePrice(int bikePrice) {
		this.bikePrice = bikePrice;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
	
	
}
