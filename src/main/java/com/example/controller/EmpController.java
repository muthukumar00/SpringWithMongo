package com.example.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.EmpModel;
import com.example.service.EmpolyeeService;

@RestController
@RequestMapping(value="/api/mongo/emp")
public class EmpController {

	@Autowired
	EmpolyeeService empservice;
	
	@PostMapping(value="/create")
	public String create(@RequestBody List<EmpModel> emp) {
		empservice.createEmployee(emp);
		return "Empolyee Record created";
	}
	
	@GetMapping(value="/getall")
	public Collection<EmpModel> getAll() {
		return empservice.getEmployee();
	}
}
