package com.mindtree.brandmanagement.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.brandmanagement.exception.serviceException.NoSuchDealerException;

@ControllerAdvice
public class ExceptionHandller {

	
	
	

	
		private String applicationName;
		@ExceptionHandler
		public ModelAndView deafultErrorHandler(HttpServletRequest req,Exception e) {
		    ModelAndView modelandview=new ModelAndView();
		    modelandview.addObject("ApplicationName",applicationName);
		    modelandview.addObject("Status",HttpStatus.NOT_FOUND.value());
		    modelandview.addObject("ErrorMessage",e.getMessage());
		    modelandview.addObject("url",req.getRequestURI());
		    modelandview.setViewName("insertstudent");
		   
		    return modelandview;
		}

		public ModelAndView deafultErrorHandler(HttpServletRequest req,NoSuchDealerException e) {
		    ModelAndView modelandview=new ModelAndView();
		    modelandview.addObject("ApplicationName",applicationName);
		    modelandview.addObject("Status",HttpStatus.NOT_FOUND.value());
		    modelandview.addObject("ErrorMessage",e.getMessage());
		    modelandview.addObject("url",req.getRequestURI());
		    modelandview.setViewName("getbikedetails");
		   
		    return modelandview;
		}

		
	}


