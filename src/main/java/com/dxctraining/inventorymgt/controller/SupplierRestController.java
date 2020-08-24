package com.dxctraining.inventorymgt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;
import com.dxctraining.inventorymgt.supplier.service.ISupplierService;

@RestController
@RequestMapping("/supplier")
public class SupplierRestController {

	@Autowired
	private ISupplierService supplierservice;

	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public Supplier create(@RequestBody CreateSupplierRequest requestData) {
		// int id=requestData.getId();/*@GeneratedValue*/
		String name = requestData.getName();
		Supplier supplier = new Supplier(name);
		supplier = supplierservice.addSupplier(supplier);
		return supplier;
	}

	/*
	 * uri is /suppliers/get /suppliers/get?id=10 /suppliers/get/abc/10
	 */
	@GetMapping("/get/{id}")
	public Supplier findSupplier(@PathVariable("id") int id) {
		Supplier supplier = supplierservice.findSupplierById(id);
		return supplier;
	}

	/**
	 * uri is /suppliers/update
	 */
	@PutMapping("/update")
	public Supplier updateSupplier(@RequestBody UpdateSupplierRequest requestData) {
		String name = requestData.getName();
		int id = requestData.getId();

		Supplier supplier = new Supplier(name);
		supplier.setId(id);
		supplier = supplierservice.addSupplier(supplier);
		return supplier;
	}

}
