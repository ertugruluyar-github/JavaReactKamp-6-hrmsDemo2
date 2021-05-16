package com.kodlamaio.hrmsDemo2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrmsDemo2.business.abstracts.SystemEmployeeService;
import com.kodlamaio.hrmsDemo2.dataAccess.abstracts.SystemEmployeeDao;
import com.kodlamaio.hrmsDemo2.entities.concretes.SystemEmployee;

@Service
public class SystemEmployeeManager implements SystemEmployeeService {
	
	private SystemEmployeeDao systemEmployeeDao;
	
	@Autowired
	public SystemEmployeeManager(SystemEmployeeDao systemEmployeeDao) {
		this.systemEmployeeDao = systemEmployeeDao;
	}

	@Override
	public List<SystemEmployee> getAll() {
		return this.systemEmployeeDao.findAll();
	}

	@Override
	public SystemEmployee get(int id) {
		return this.systemEmployeeDao.findById(id).orElse(null);
	}

	@Override
	public void add(SystemEmployee systemEmployee) {
		this.systemEmployeeDao.save(systemEmployee);
	}

	@Override
	public void delete(int id) {
		this.systemEmployeeDao.deleteById(id);
	}

	@Override
	public void update(SystemEmployee systemEmployee) {
		this.systemEmployeeDao.save(systemEmployee);
	}

	@Override
	public boolean existsSystemEmployeeByNationalityId(String nationalityId) {
		return this.systemEmployeeDao.existsSystemEmployeeByNationalityId(nationalityId);
	}

	@Override
	public boolean existsSystemEmployeeByEmail(String email) {
		return this.systemEmployeeDao.existsSystemEmployeeByEmail(email);
	}

}
