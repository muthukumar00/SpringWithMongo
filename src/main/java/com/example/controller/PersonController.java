package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Person;
import com.example.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping(value = "/api/create", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public String create(@RequestParam String firstName, @RequestParam String lastName, @RequestParam int age) {
		Person p = personService.create(firstName, lastName, age);
		return p.toString();
	}
	
	@RequestMapping("angular")
	public String testProcess() {
		return "test";
	}
	
	@RequestMapping("/get")
	public Person getPerson(@RequestParam String firstName) {
		return personService.findByFirstName(firstName);
	}
	
	@RequestMapping("/getAll")
	public List<Person> getAllPerson() {
		return personService.getAll();
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam String firstName) {
		personService.deleteByName(firstName);
		return "Deleted" + firstName; 
	}
	
	@RequestMapping("/deleteAll")
	public String deleteAll() {
		personService.deleteAll();
		return "Delete All";
	}
	
	
}
