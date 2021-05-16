package com.kodlamaio.hrmsDemo2.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.hrmsDemo2.business.abstracts.SystemEmployeeService;
import com.kodlamaio.hrmsDemo2.entities.concretes.SystemEmployee;

@RestController
@RequestMapping("/api/systememployes")
public class SystemEmployeeController {
	
	private SystemEmployeeService systemEmployeeService;
	
	@Autowired
	public SystemEmployeeController(SystemEmployeeService systemEmployeeService) {
		this.systemEmployeeService = systemEmployeeService;
	}
	
	@Transactional
	@GetMapping("/getall")
	public List<SystemEmployee> getAll() {
		return this.systemEmployeeService.getAll();
	}
	
	@Transactional
	@GetMapping("/{id}")
	public SystemEmployee get(@PathVariable int id) {
		return this.systemEmployeeService.get(id);
	}

	@Transactional
	@PostMapping("/add")
	public void add(@RequestBody SystemEmployee systemEmployee) {
		this.systemEmployeeService.add(systemEmployee);
	}
	
	@Transactional
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		this.systemEmployeeService.delete(id);
	}

	@Transactional
	@PutMapping("/update")
	public void update(@RequestBody SystemEmployee systemEmployee) {
		this.systemEmployeeService.update(systemEmployee);
	}
	
}
