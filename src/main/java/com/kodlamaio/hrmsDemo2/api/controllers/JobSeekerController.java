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

import com.kodlamaio.hrmsDemo2.business.abstracts.JobSeekerService;
import com.kodlamaio.hrmsDemo2.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekerController {
	
	private JobSeekerService jobSeekerService;
	
	@Autowired
	public JobSeekerController(JobSeekerService jobSeekerService) {
		this.jobSeekerService = jobSeekerService;
	}
	
	@Transactional
	@GetMapping("/getall")
	public List<JobSeeker> getAll() {
		return this.jobSeekerService.getAll();
	}
	
	@Transactional
	@GetMapping("/{id}")
	public JobSeeker get(@PathVariable int id) {
		return this.jobSeekerService.get(id);
	}

	@Transactional
	@PostMapping("/add")
	public void add(@RequestBody JobSeeker jobSeeker) {
		this.jobSeekerService.add(jobSeeker);
	}

	@Transactional
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		this.jobSeekerService.delete(id);
	}

	@Transactional
	@PutMapping("/update")
	public void update(@RequestBody JobSeeker jobSeeker) {
		this.jobSeekerService.update(jobSeeker);
	}

}
