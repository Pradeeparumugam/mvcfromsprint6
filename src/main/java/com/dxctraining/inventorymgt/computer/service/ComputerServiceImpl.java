package com.dxctraining.inventorymgt.computer.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxctraining.inventorymgt.computer.dao.*;
import com.dxctraining.inventorymgt.computer.entities.Computer;

import com.dxctraining.inventorymgt.computer.exceptions.NotValid;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;

@Transactional
@Service
public class ComputerServiceImpl implements ComputerService {
	@Autowired
	private ComputerDao computerdao;

	public Computer addComputer(Computer computer) {
		verify(computer);
		computer = computerdao.addComputer(computer);
		return computer;

	}

	@Override
	public Computer findComputerById(int id) {
		verify(id);
		Computer computer = computerdao.findComputerById(id);
		return computer;
	}

	@Override
	public void removeComputer(int id) {
		verify(id);
		computerdao.removeComputer(id);
	}
	public List<Computer> displayComputer() {
		 List<Computer>computers=computerdao.displayComputer(); 
	        return computers; 
	}


	public void verify(Object ob) {
		if (ob==null) {
			throw new NotValid("not valid");
		}
	}
	
}
