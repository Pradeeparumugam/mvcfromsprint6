package com.dxctraining.inventorymgt.phone.entities;

import javax.persistence.Entity;

import com.dxctraining.inventorymgt.item.entities.Item;

@Entity
public class Phone extends Item{
	private int storagesize;
	//private int id;
	private String name;

	public Phone(String name,int storagesize) {
	
		this.name=name;
		this.storagesize=storagesize;
		
	}
	public Phone() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStoragesize() {
		return storagesize;
	}

	public void setStoragesize(int storagesize) {
		this.storagesize = storagesize;
	}
	

}
