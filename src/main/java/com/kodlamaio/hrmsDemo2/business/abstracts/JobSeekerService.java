package com.kodlamaio.hrmsDemo2.business.abstracts;

import java.util.List;

import com.kodlamaio.hrmsDemo2.entities.concretes.JobSeeker;

public interface JobSeekerService {
	List<JobSeeker> getAll();
	JobSeeker get(int id);
	void add(JobSeeker jobSeeker);
	void delete(int id);
	void update(JobSeeker jobSeeker);
	boolean existsJobSeekerByNationalityId(String nationalityId);
	boolean existsJobSeekerByEmail(String email);
}
