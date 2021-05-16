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

import com.kodlamaio.hrmsDemo2.business.abstracts.EmployeePositionService;
import com.kodlamaio.hrmsDemo2.entities.concretes.EmployeePosition;

@RestController
@RequestMapping("/api/employeepositions")
public class EmployeePositionController {
	
	private EmployeePositionService employeePositionService;
	
	@Autowired
	public EmployeePositionController(EmployeePositionService employeePositionService) {
		this.employeePositionService = employeePositionService;
	}
	
	@Transactional
	@GetMapping("/getall")
	public List<EmployeePosition> getAll() {
		return this.employeePositionService.getAll();
	}
	
	@Transactional
	@GetMapping("/{id}")
	public EmployeePosition get(@PathVariable int id) {
		return this.employeePositionService.get(id);
	}
	
	@Transactional
	@PostMapping("/add")
	public void add(@RequestBody EmployeePosition employeePosition) {
		this.employeePositionService.add(employeePosition);
	}

	@Transactional
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		this.employeePositionService.delete(id);
	}

	@Transactional
	@PutMapping("/update")
	public void update(@RequestBody EmployeePosition employeePosition) {
		this.employeePositionService.update(employeePosition);
	}
	
	@Transactional	
	@GetMapping("/isExistByPositionName/{positionName}")
	public boolean existsEmployeePositionByPositionName(@PathVariable String positionName) {
		return this.employeePositionService.existsEmployeePositionByPositionName(positionName);
	}
	
}
