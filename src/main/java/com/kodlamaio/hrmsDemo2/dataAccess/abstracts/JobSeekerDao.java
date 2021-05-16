package com.kodlamaio.hrmsDemo2.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodlamaio.hrmsDemo2.entities.concretes.JobSeeker;

@Repository
public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {
	boolean existsJobSeekerByNationalityId(String nationalityId);
	boolean existsJobSeekerByEmail(String email);
}
