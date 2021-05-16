package com.kodlamaio.hrmsDemo2.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodlamaio.hrmsDemo2.entities.concretes.PhoneNumber;

@Repository
public interface PhoneNumberDao extends JpaRepository<PhoneNumber, Integer> {
	boolean existsPhoneNumberByPhoneNumber(String phoneNumber);
}
