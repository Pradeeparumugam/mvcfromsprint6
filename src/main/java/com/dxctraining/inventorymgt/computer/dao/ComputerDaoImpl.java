package com.dxctraining.inventorymgt.computer.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.stereotype.Repository;

import com.dxctraining.inventorymgt.computer.entities.Computer;
import com.dxctraining.inventorymgt.computer.exceptions.NotValid;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;

@Repository
public class ComputerDaoImpl implements ComputerDao {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Computer addComputer(Computer computer) {
		if (computer == null) {
			throw new NotValid("not valid");
		}
		computer = em.merge(computer);
		return computer;

	}
	
	@Override
	public Computer findComputerById(int id) {
		if (id < 1) {
			throw new NotValid("not valid");
		}
		Computer computer = em.find(Computer.class, id);
		return computer;
	}

	@Override
	public void removeComputer(int id) {
		if (id < 1) {
			throw new NotValid("not valid");
		}
		Computer computer = findComputerById(id);
		em.remove(computer);
	}
	public List<Computer> displayComputer() {
		String jpaql = "from supplier";
		TypedQuery<Computer> query = em.createQuery(jpaql,Computer.class);
		List<Computer> computerlist = query.getResultList();
		return computerlist;
	}

}
