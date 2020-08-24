package com.dxctraining.inventorymgt.controller;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dxctraining.inventorymgt.computer.entities.Computer;
import com.dxctraining.inventorymgt.computer.service.ComputerService;
import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;
import com.dxctraining.inventorymgt.supplier.service.ISupplierService;

@Controller
public class ComputerController extends Item{

			@Autowired
			private ComputerService computerservice;
			@Autowired
			private ISupplierService supplierservice;
			
			@PostConstruct
			public void init() {
				
				Supplier s1 = new Supplier("name1");
				Supplier s2 = new Supplier("name2");

				supplierservice.addSupplier(s1);
				supplierservice.addSupplier(s2);

				
				Computer c1 = new Computer("Computername1", 8);
				Computer c2 = new Computer("Computername2", 16);
					computerservice.addComputer(c1);
					computerservice.addComputer(c2);

//					int id1 = c1.getId();
//					Computer computer = computerservice.findComputerById(id1);
//					
//					System.out.println("Computer Details =" + computer.getId() + " " + computer.getName()+ " " +computer.getDisksize());
//					int id2 = c2.getId();
//					Computer computer2 = computerservice.findComputerById(id2);
//					
//					System.out.println("Computer Details =" + computer2.getId() + " " + computer2.getName()+" "+computer2.getDisksize());

					System.out.println("Computer completed");
			}
			
				
				@GetMapping("/computer") 
				 	public ModelAndView computerdetails(@RequestParam("id") int id) { 
					System.out.println("computer details print stmt");
				 		Computer computer = computerservice.findComputerById(id); 
				 		ModelAndView mv = new ModelAndView("computerdetails", "computer", computer); 
				 		return mv; 
				 	} 
				 	 
				 	@GetMapping("/computerlist") 
		 		 	public ModelAndView allComputers() { 
				 		System.out.println("computer list print stmt");
				 		List<Computer>listAll = computerservice.displayComputer(); 
				 		ModelAndView mv = new ModelAndView("computerlist","computers",listAll); 
				 		return mv; 
				 	}
				 	@GetMapping("/computerregister") 
			 	 	public ModelAndView computerreg() { 
			 	 		ModelAndView mv = new ModelAndView("computerregister"); 
			 	 		return mv; 
			 	 	} 
			 	 
			 	 
			 	 	@GetMapping("/newcomputerregistering") 
			 	 	public ModelAndView processRegister( @RequestParam("name") String name,@RequestParam("disksize") int disksize) { 
			 	 		System.out.println("new Computer name=" + name+ "  DiskSize="+disksize); 
			 	 		Computer computer = new Computer(name,disksize); 
			 	 		computer = computerservice.addComputer(computer);
			 	 		ModelAndView mv = new ModelAndView("computerdetails", "computer",computer); 
			 	 		return mv; 
			 	 	} 
		}

