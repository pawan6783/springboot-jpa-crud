package com.example.springdemo.cruddemo.dao;

import java.util.List;

import com.example.springdemo.cruddemo.entity.Employee;

public interface EmployeeDAO {
	public List<Employee> findAll();
	public Employee findById(int theId);
	public void save(Employee theEmployee);
	public void deleteById(int theId);
}
