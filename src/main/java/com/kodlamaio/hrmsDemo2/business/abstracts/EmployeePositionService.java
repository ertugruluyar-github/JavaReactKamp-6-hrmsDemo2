package com.kodlamaio.hrmsDemo2.business.abstracts;

import java.util.List;

import com.kodlamaio.hrmsDemo2.entities.concretes.EmployeePosition;

public interface EmployeePositionService {
	List<EmployeePosition> getAll();
	EmployeePosition get(int id);
	void add(EmployeePosition employeePosition);
	void delete(int id);
	void update(EmployeePosition employeePosition);
	boolean existsEmployeePositionByPositionName(String positionName);
}
