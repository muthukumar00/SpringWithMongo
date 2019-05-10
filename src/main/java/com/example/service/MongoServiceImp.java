package com.example.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDAO;
import com.example.model.EmpModel;

@Service
public class MongoServiceImp implements EmpolyeeService {

	@Autowired
	EmployeeDAO empDAO;
	
	@Override
	public void createEmployee(List<EmpModel> emp) {
		// TODO Auto-generated method stub
		empDAO.saveAll(emp);
	}

	@Override
	public Collection<EmpModel> getEmployee() {
		// TODO Auto-generated method stub
		return empDAO.findAll();
	}

}
