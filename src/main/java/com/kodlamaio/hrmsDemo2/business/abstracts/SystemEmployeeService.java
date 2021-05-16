package com.kodlamaio.hrmsDemo2.business.abstracts;

import java.util.List;

import com.kodlamaio.hrmsDemo2.entities.concretes.SystemEmployee;

public interface SystemEmployeeService {
	List<SystemEmployee> getAll();
	SystemEmployee get(int id);
	void add(SystemEmployee systemEmployee);
	void delete(int id);
	void update(SystemEmployee systemEmployee);
	boolean existsSystemEmployeeByNationalityId(String nationalityId);
	boolean existsSystemEmployeeByEmail(String email);
}
