package com.kodlamaio.hrmsDemo2.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_positions")
public class EmployeePosition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="position_name", nullable = false, unique = true)
	private String positionName;
	
	public EmployeePosition() {}

	public EmployeePosition(int id, String positionName) {
		super();
		this.id = id;
		this.positionName = positionName;
	}

	public EmployeePosition(String positionName) {
		super();
		this.positionName = positionName;
	}
	
}
