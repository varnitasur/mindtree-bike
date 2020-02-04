package com.mindtree.brandmanagement.service;

import java.util.List;
import java.util.Map;

import com.mindtree.brandmanagement.entity.Bike;
import com.mindtree.brandmanagement.entity.Brand;
import com.mindtree.brandmanagement.entity.Dealer;
import com.mindtree.brandmanagement.exception.serviceException.ServiceException;

public interface BrandManagementServiceInterface {

	void insertbranddetails(Brand brand);

	List<Brand> getbranddetails();

	List<Dealer> getalldealers();

	void assignbrandtodealers(int brandId, int dealerId);

	void insertbikedetails(int brandId, Bike bike);

	List<Bike> getbikedetailsbydelaername(String dealerName) throws ServiceException;

	int getinvestment();

	Map<String,Integer> getALLInvestmentBrandMap();

}
