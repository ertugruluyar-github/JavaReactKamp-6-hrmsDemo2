package com.kodlamaio.hrmsDemo2.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodlamaio.hrmsDemo2.entities.concretes.Employer;

@Repository
public interface EmployerDao extends JpaRepository<Employer, Integer> {
	boolean existsEmployerByEmail(String email);
}
