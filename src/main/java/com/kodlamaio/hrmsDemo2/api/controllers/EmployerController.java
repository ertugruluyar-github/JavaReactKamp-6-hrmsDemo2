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

import com.kodlamaio.hrmsDemo2.business.abstracts.EmployerService;
import com.kodlamaio.hrmsDemo2.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {
	
	private EmployerService employerService;
	
	@Autowired
	public EmployerController(EmployerService employerService) {
		this.employerService = employerService;
	}
	
	@Transactional
	@GetMapping("/getall")
	public List<Employer> getAll() {
		return this.employerService.getAll();
	}
	
	@Transactional
	@GetMapping("/{id}")
	public Employer get(@PathVariable int id) {
		return this.employerService.get(id);
	}

	@Transactional
	@PostMapping("/add")
	public void add(@RequestBody Employer employer) {
		this.employerService.add(employer);
	}

	@Transactional
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		this.employerService.delete(id);
	}

	@Transactional
	@PutMapping("/update")
	public void update(@RequestBody Employer employer) {
		this.employerService.update(employer);
	}

}
