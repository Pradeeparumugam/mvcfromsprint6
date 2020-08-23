package com.dxctraining.inventorymgt;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;
import com.dxctraining.inventorymgt.supplier.service.ISupplierService;

@Controller
public class Suppliercontroller {
	
	@Autowired
	private ISupplierService supplierservice;
	
	@PostConstruct
	public void init() {

		
			Supplier s1 = new Supplier("name1");
			Supplier s2 = new Supplier("name2");

			s1 = supplierservice.addSupplier(s1);
			s2 = supplierservice.addSupplier(s2);

			int id1 = s1.getId();
			Supplier supplier = supplierservice.findSupplierById(id1);
			
			System.out.println("Supplier Details =" + supplier.getId() + " " + supplier.getName());
			int id2 = s2.getId();
			Supplier supplier2 = supplierservice.findSupplierById(id2);
			System.out.println("Supplier Details =" + supplier2.getId() + " " + supplier2.getName());

			System.out.println("Supplier completed");
	}
	
		
		@GetMapping("/supplier") 
		 	public ModelAndView supplierdetails(@RequestParam("id") int id) { 
			System.out.println("supplier details print stmt");
		 		Supplier supplier = supplierservice.findSupplierById(id); 
		 		ModelAndView mv = new ModelAndView("supplierdetails", "supplier", supplier); 
		 		return mv; 
		 	} 
		 	 
		 	@GetMapping("/listall") 
 		 	public ModelAndView allSuppliers() { 
		 		System.out.println("supplier list print stmt");
		 		List<Supplier>listAll = supplierservice.displaySuppliers(); 
		 		ModelAndView mv = new ModelAndView("supplierlist","suppliers",listAll); 
		 		return mv; 
		 	}
}



