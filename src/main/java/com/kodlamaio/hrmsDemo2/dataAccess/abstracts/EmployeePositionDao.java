package com.kodlamaio.hrmsDemo2.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kodlamaio.hrmsDemo2.entities.concretes.EmployeePosition;

@Repository
public interface EmployeePositionDao extends JpaRepository<EmployeePosition, Integer> {
	boolean existsEmployeePositionByPositionName(String positionName);
}
