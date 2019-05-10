package com.example.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.model.EmpModel;

@Repository
public interface EmployeeDAO extends MongoRepository<EmpModel, Integer> {

}
