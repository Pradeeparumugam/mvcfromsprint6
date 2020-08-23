package com.dxctraining.inventorymgt.computer.entities;

import javax.persistence.Entity;


import com.dxctraining.inventorymgt.item.entities.Item;



@Entity
public class Computer extends Item{
	private int disksize;
	//private int id;
	private String name;
	
	public Computer(String name,int disksize) {
	
		this.name=name;
		this.disksize=disksize;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Computer() {
		
	}
	public int getDisksize() {
		return disksize;
	}

	public void setDisksize(int disksize) {
		this.disksize = disksize;
	}
	

}
