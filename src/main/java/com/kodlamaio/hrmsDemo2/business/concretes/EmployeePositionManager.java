package com.kodlamaio.hrmsDemo2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrmsDemo2.business.abstracts.EmployeePositionService;
import com.kodlamaio.hrmsDemo2.dataAccess.abstracts.EmployeePositionDao;
import com.kodlamaio.hrmsDemo2.entities.concretes.EmployeePosition;

@Service
public class EmployeePositionManager implements EmployeePositionService {
	
	private EmployeePositionDao employeePositionDao;
	
	@Autowired
	public EmployeePositionManager(EmployeePositionDao employeePositionDao) {
		this.employeePositionDao = employeePositionDao;
	}

	@Override
	public List<EmployeePosition> getAll() {
		return this.employeePositionDao.findAll();
	}

	@Override
	public EmployeePosition get(int id) {
		return this.employeePositionDao.findById(id).orElse(null);
	}

	@Override
	public void add(EmployeePosition employeePosition) {
		this.employeePositionDao.save(employeePosition);
	}

	@Override
	public void delete(int id) {
		this.employeePositionDao.deleteById(id);
	}

	@Override
	public void update(EmployeePosition employeePosition) {
		this.employeePositionDao.save(employeePosition);
	}

	@Override
	public boolean existsEmployeePositionByPositionName(String positionName) {
		return this.employeePositionDao.existsEmployeePositionByPositionName(positionName);
	}

}
