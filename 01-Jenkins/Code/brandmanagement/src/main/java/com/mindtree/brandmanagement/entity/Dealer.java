package com.mindtree.brandmanagement.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Dealer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int dealerId;
	private String dealerName;
	private String dealerAddress;
	@ManyToOne(cascade = CascadeType.ALL)
	private Brand brand;
	public Dealer() {
		super();
	}
	public Dealer(int dealerId, String dealerName, String dealerAddress, Brand brand) {
		super();
		this.dealerId = dealerId;
		this.dealerName = dealerName;
		this.dealerAddress = dealerAddress;
		this.brand = brand;
	}
	public int getDealerId() {
		return dealerId;
	}
	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}
	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	public String getDealerAddress() {
		return dealerAddress;
	}
	public void setDealerAddress(String dealerAddress) {
		this.dealerAddress = dealerAddress;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	
	
}
