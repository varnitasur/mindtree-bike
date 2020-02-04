package com.mindtree.brandmanagement.service.serviceimpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.brandmanagement.entity.Bike;
import com.mindtree.brandmanagement.entity.Brand;
import com.mindtree.brandmanagement.entity.Dealer;
import com.mindtree.brandmanagement.exception.serviceException.NoSuchDealerException;
import com.mindtree.brandmanagement.exception.serviceException.ServiceException;
import com.mindtree.brandmanagement.repository.BikeRepository;
import com.mindtree.brandmanagement.repository.BrandRepository;
import com.mindtree.brandmanagement.repository.DealerRepository;
import com.mindtree.brandmanagement.service.BrandManagementServiceInterface;
@Service
public class BrandManagementServiceImpl implements BrandManagementServiceInterface {

	@Autowired
	BikeRepository bikeRepository;
	
	@Autowired
	BrandRepository brandRepository;
	@Autowired
	DealerRepository dealerRepository;
	
	public void insertbranddetails(Brand brand) {
		
		brandRepository.save(brand);
	}

	
	public List<Brand> getbranddetails() {
		List<Brand> brands=brandRepository.findAll();
		return brands;
	}


	
	public List<Dealer> getalldealers() {
		List<Dealer> dealers=dealerRepository.findAll();
		return dealers;
	}


	
	public void assignbrandtodealers(int brandId, int dealerId) {
		Brand brand=brandRepository.findById(brandId).get();
		Dealer dealer=dealerRepository.findById(dealerId).get();
		dealer.setBrand(brand);
		dealerRepository.save(dealer);
		
	}


	
	public void insertbikedetails(int brandId, Bike bike) {
		Brand brand=brandRepository.findById(brandId).get();
      bike.setBrand(brand);
      bikeRepository.save(bike);
		
	}


	
	public List<Bike> getbikedetailsbydelaername(String dealerName) throws ServiceException {
		Optional<Dealer> dealer=dealerRepository.findBydealerName(dealerName);
		if(!dealer.isPresent())
		{
			throw new NoSuchDealerException("No such dealer found");
		}
		Brand brand=dealer.get().getBrand();
		List<Bike> bikes=brand.getBikes();
		
		
		return bikes;
	}


	@Override
	public int getinvestment() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public Map<String, Integer> getALLInvestmentBrandMap() {
		Map<String ,Integer> map1=new HashMap<String, Integer>();
		for(Brand brand:brandRepository.findAll())
		{ 
			int investment=0;
			for(Bike bike:brand.getBikes())
			{
			 investment+=bike.getBikePrice();
			}
			map1.put(brand.getBrandName(), investment);
		}
		
		return map1;
	}

}
