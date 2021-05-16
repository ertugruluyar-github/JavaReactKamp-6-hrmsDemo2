package com.kodlamaio.hrmsDemo2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrmsDemo2.business.abstracts.EmployerService;
import com.kodlamaio.hrmsDemo2.dataAccess.abstracts.EmployerDao;
import com.kodlamaio.hrmsDemo2.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		this.employerDao = employerDao;
	}

	@Override
	public List<Employer> getAll() {
		return this.employerDao.findAll();
	}

	@Override
	public Employer get(int id) {
		return this.employerDao.findById(id).orElse(null);
	}

	@Override
	public void add(Employer employer) {
		this.employerDao.save(employer);
	}

	@Override
	public void delete(int id) {
		this.employerDao.deleteById(id);
	}

	@Override
	public void update(Employer employer) {
		this.employerDao.save(employer);
	}

	@Override
	public boolean existsEmployerByEmail(String email) {
		return this.employerDao.existsEmployerByEmail(email);
	}

}
