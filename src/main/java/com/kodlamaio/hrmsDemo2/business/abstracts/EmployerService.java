package com.kodlamaio.hrmsDemo2.business.abstracts;

import java.util.List;

import com.kodlamaio.hrmsDemo2.entities.concretes.Employer;

public interface EmployerService {
	List<Employer> getAll();
	Employer get(int id);
	void add(Employer employer);
	void delete(int id);
	void update(Employer employer);
	boolean existsEmployerByEmail(String email);
}
