package com.mindtree.brandmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.brandmanagement.entity.Bike;
import com.mindtree.brandmanagement.entity.Brand;
import com.mindtree.brandmanagement.entity.Dealer;
import com.mindtree.brandmanagement.exception.AppException;
import com.mindtree.brandmanagement.exception.serviceException.ServiceException;
import com.mindtree.brandmanagement.service.BrandManagementServiceInterface;

@Controller
public class BrandManagementControllerApp {
	@Autowired
	BrandManagementServiceInterface brandManagementServiceInterface;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/back")
	public String index1() {
		return "index";
	}

	@RequestMapping("/addbrand")
	public String addbrand() {
		return "brand";

	}

	@PostMapping("/addbranddetails")
	public String addbranddetails(Brand brand) {
		System.out.println(brand.getBrandName());
		brandManagementServiceInterface.insertbranddetails(brand);
		return "brand";
	}

	@RequestMapping("/assignbrandtodealer")
	public String assignbrandtodealer(Model model) {
		List<Brand> brands = brandManagementServiceInterface.getbranddetails();
		List<Dealer> dealers = brandManagementServiceInterface.getalldealers();
		model.addAttribute("brands", brands);
		model.addAttribute("dealers", dealers);
		return "assignbrandtodealer";
	}

	@PostMapping("/addbrandtodealer")
	public String addbrandtodealer(@RequestParam("brandId") int brandId, @RequestParam("dealerId") int dealerId,
			Model model) {
		brandManagementServiceInterface.assignbrandtodealers(brandId, dealerId);
		List<Brand> brands = brandManagementServiceInterface.getbranddetails();
		List<Dealer> dealers = brandManagementServiceInterface.getalldealers();
		model.addAttribute("brands", brands);
		model.addAttribute("dealers", dealers);
		return "success";
	}

	@RequestMapping("/addbikestobrand")
	public String addbikestobrand(Model model) {
		List<Brand> brands = brandManagementServiceInterface.getbranddetails();
		model.addAttribute("brands", brands);
		return "bike";
	}

	@PostMapping("/addbike")
	public String addbikedetails(@RequestParam("brandId") int brandId, Bike bike, Model model) {
		brandManagementServiceInterface.insertbikedetails(brandId, bike);
		List<Brand> brands = brandManagementServiceInterface.getbranddetails();
		model.addAttribute("brands", brands);
		return "bike";
	}

	@RequestMapping("/getbikesbydealername")
	public String getbikesbydealername() {
		return "getbikebydealername";

	}
	@GetMapping("/getbikedetails")
	public String getbikedata(@RequestParam("dealerName") String dealerName,Model model) throws AppException
	{
		List<Bike> bikes=brandManagementServiceInterface.getbikedetailsbydelaername(dealerName);
		model.addAttribute("bikes",bikes);
		return "getbikebydealername";
	}
	@RequestMapping("/gettotalinvestmentofabrand")
	public String getAllRevenue(Model model)
	{
	model.addAttribute("investmentMap", brandManagementServiceInterface.getALLInvestmentBrandMap());
	return "totalmoneygenerated";	
	}

}
