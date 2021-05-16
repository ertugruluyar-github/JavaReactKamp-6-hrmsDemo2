package com.kodlamaio.hrmsDemo2.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.hrmsDemo2.business.abstracts.PhoneNumberService;
import com.kodlamaio.hrmsDemo2.dataAccess.abstracts.PhoneNumberDao;
import com.kodlamaio.hrmsDemo2.entities.concretes.PhoneNumber;

@Service
public class PhoneNumberManager implements PhoneNumberService {
	
	private PhoneNumberDao phoneNumberDao;
	
	@Autowired
	public PhoneNumberManager(PhoneNumberDao phoneNumberDao) {
		this.phoneNumberDao = phoneNumberDao;
	}

	@Override
	public List<PhoneNumber> getAll() {
		return this.phoneNumberDao.findAll();
	}

	@Override
	public PhoneNumber get(int id) {
		return this.phoneNumberDao.findById(id).orElse(null);
	}

	@Override
	public void add(PhoneNumber phoneNumber) {
		this.phoneNumberDao.save(phoneNumber);
	}

	@Override
	public void delete(int id) {
		this.phoneNumberDao.deleteById(id);
	}

	@Override
	public void update(PhoneNumber phoneNumber) {
		this.phoneNumberDao.save(phoneNumber);
	}

	@Override
	public boolean existsPhoneNumberByPhoneNumber(String phoneNumber) {
		return this.phoneNumberDao.existsPhoneNumberByPhoneNumber(phoneNumber);
	}

}
