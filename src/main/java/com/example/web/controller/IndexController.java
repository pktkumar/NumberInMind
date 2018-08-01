package com.example.web.controller;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IndexController {
	

	
	@RequestMapping("/")
	public String SelectNumber() {
		
		
		
				return "SelectNumber";
				
	}
	
	
	@RequestMapping("/PageOne")
	public String PageOne() {
		
		
		
				return "PageOne";
				
	}

	@RequestMapping("/PageTwo")
	public String PageTwoYes(HttpSession session,ModelMap modelMap, @RequestParam(value="value", required=false) int value) {
		
		
		System.out.println("value on page two "+ value);
		
		
		modelMap.put("currentValue", value);
		
		
		
				return "PageTwo";
				
	}

	

	
	@RequestMapping("/PageThree")
	public String PageThree(HttpSession session, ModelMap modelMap, @RequestParam(value="value", required=false) int value, @RequestParam(value="currentValue", required=false) int currentValue) {
		
		
		System.out.println("value on page two "+ value);
		
		modelMap.put("currentValue", value+currentValue);
		
		System.out.println("currentValue on page three "+ currentValue);
		
				return "PageThree";
				
	}

	
	@RequestMapping("/PageFour")
	public String PageFour(HttpSession session,  ModelMap modelMap, @RequestParam(value="value", required=false) int value, @RequestParam(value="currentValue", required=false) int currentValue) {
		
		
		
		System.out.println("value on page four "+ value);
		
		modelMap.put("currentValue", value+currentValue);
		
		System.out.println("currentValue on page four "+ currentValue);
		
				return "PageFour";
				
	}	
	
	
	@RequestMapping("/Result")
	public String Result(HttpSession session,ModelMap modelMap, @RequestParam(value="value", required=false) int value, @RequestParam(value="currentValue", required=false) int currentValue) {
		
		int newValue=0;
		String message="";
		
		System.out.println("value on page Result "+ value);
		

		
		
		newValue= value+currentValue;
		
		System.out.println("newValue on page Result "+ newValue);
		
	       switch (newValue) {
	         case 1:  
	        	   message= "6";
	        	   break;
	         case 2: 
	        	    message= "9";
	        	    break;
	         case 3: 
	        	   message= "7";
	        	   break;
	                
	         case 4:  
	        	    message= "3";
	        	    break;
	        	    
	         case 5:  
	        	    message= "2";
	        	    break;
	        	    
	         case 6:  
	        	    message= "10";
	        	    break;
	        	    
	         case 7:  
	        	    message= "8";
	        	    break;
	         case 8:  
	        	    message= "1";
	        	    break;
	         case 9:  
	        	    message= "5";
	        	    break;
	         case 10:  
	        	    message= "4";
	        	    break;
	         default:
	        	 message ="Somethink went wrong!!!!";
	        	    
	         }

		System.out.println("currentValue on page Result "+ currentValue);
		
		modelMap.put("currentValue", message);
		
				return "Result";
				
	}		

	
	}