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

import com.kodlamaio.hrmsDemo2.business.abstracts.PhoneNumberService;
import com.kodlamaio.hrmsDemo2.entities.concretes.PhoneNumber;

@RestController
@RequestMapping("/api/phonenumbers")
public class PhoneNumberController {
private PhoneNumberService phoneNumberService;
	
	@Autowired
	public PhoneNumberController(PhoneNumberService employerService) {
		this.phoneNumberService = employerService;
	}
	
	@Transactional
	@GetMapping("/getall")
	public List<PhoneNumber> getAll() {
		return this.phoneNumberService.getAll();
	}
	
	@Transactional
	@GetMapping("/{id}")
	public PhoneNumber get(@PathVariable int id) {
		return this.phoneNumberService.get(id);
	}

	@Transactional
	@PostMapping("/add")
	public void add(@RequestBody PhoneNumber phoneNumber) {
		this.phoneNumberService.add(phoneNumber);
	}

	@Transactional
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		this.phoneNumberService.delete(id);
	}

	@Transactional
	@PutMapping("/update")
	public void update(@RequestBody PhoneNumber phoneNumber) {
		this.phoneNumberService.update(phoneNumber);
	}
}
