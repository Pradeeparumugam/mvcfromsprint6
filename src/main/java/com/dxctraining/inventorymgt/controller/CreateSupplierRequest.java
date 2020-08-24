package com.dxctraining.inventorymgt.controller;

public class CreateSupplierRequest {
	private String name;


	public CreateSupplierRequest() {
	}

	public CreateSupplierRequest(String name) {
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
