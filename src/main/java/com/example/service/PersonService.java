package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Person;
import com.example.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	// Create 
	public Person create(String firstName, String lastName, int age) {
		return personRepository.save(new Person(firstName, lastName, age));
	}
	
	// Retrieve
	public List<Person> getAll() {
		return personRepository.findAll();
	}
	
	// get seperate
	public Person findByFirstName(String firstName) {
		return personRepository.findByFirstName(firstName);
	}
	
	// update 
	public Person update(String firstName, String lastName, int age) {
		Person p = personRepository.findByFirstName(firstName);
		p.setLastName(lastName);
		p.setAge(age);
		return personRepository.save(p);
	}
	
	public void deleteAll() {
		personRepository.deleteAll();
	}
	
	public void deleteByName(String firstName) {
		Person p = personRepository.findByFirstName(firstName);
		personRepository.delete(p);
	}
}
