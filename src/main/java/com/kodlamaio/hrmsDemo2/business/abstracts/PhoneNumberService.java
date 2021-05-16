package com.kodlamaio.hrmsDemo2.business.abstracts;

import java.util.List;

import com.kodlamaio.hrmsDemo2.entities.concretes.PhoneNumber;

public interface PhoneNumberService {
	List<PhoneNumber> getAll();
	PhoneNumber get(int id);
	void add(PhoneNumber phoneNumber);
	void delete(int id);
	void update(PhoneNumber phoneNumber);
	boolean existsPhoneNumberByPhoneNumber(String phoneNumber);
}
