package com.dxctraining.inventorymgt.phone.service;

import java.util.List;

import com.dxctraining.inventorymgt.phone.entities.Phone;

public interface PhoneService {
	public Phone addPhone(Phone phone);
	public Phone findPhoneById(int id);
	public void removePhone(int id);
	public List<Phone> displayPhone();
}
