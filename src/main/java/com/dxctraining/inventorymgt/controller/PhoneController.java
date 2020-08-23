package com.dxctraining.inventorymgt.controller;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dxctraining.inventorymgt.phone.entities.Phone;
import com.dxctraining.inventorymgt.phone.service.PhoneService;

@Controller
public class PhoneController {

		@Autowired
		private PhoneService phoneservice;
		
		@PostConstruct
		public void init() {

			
			Phone i1 = new Phone("Phonename1", 128);
			Phone i2 = new Phone("Phonename2", 256);
				phoneservice.addPhone(i1);
				phoneservice.addPhone(i2);

//				int id1 = i1.getId();
//				Phone phone = phoneservice.findPhoneById(id1);
//				
//				System.out.println("Phone Details =" + phone.getId() + " " + phone.getName());
//				int id2 = i2.getId();
//				Phone phone2 = phoneservice.findPhoneById(id2);
//				System.out.println("Phone Details =" + phone2.getId() + " " + phone2.getName());
//
			System.out.println("Phone completed");
		}
		
			
			/*@GetMapping("/phone") 
			 	public ModelAndView supplierdetails(@RequestParam("id") int id) { 
				System.out.println("phone details print stmt");
			 		Phone phone = phoneservice.findPhoneById(id); 
			 		ModelAndView mv = new ModelAndView("supplierdetails", "supplier", supplier); 
			 		return mv; 
			 	} */
			 	 
			 	@GetMapping("/phonelist") 
	 		 	public ModelAndView allPhones() { 
			 		System.out.println("phone list print stmt");
			 		List<Phone>listAll = phoneservice.displayPhone(); 
			 		ModelAndView mv = new ModelAndView("phonelist","phones",listAll); 
			 		return mv; 
			 	}
	}

