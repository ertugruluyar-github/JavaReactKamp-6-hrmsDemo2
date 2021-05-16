package com.kodlamaio.hrmsDemo2.entities.abstracts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
//WARN 4772 --- [  restartedMain] org.hibernate.cfg.AnnotationBinder       : HHH000139: Illegal use of @Table in a subclass of a SINGLE_TABLE hierarchy: com.kodlamaio.hrmsDemo.entities.concretes.Employer
// Spring ile bağlantıyı sağladrken consoldaki yazılar arasında yukarıdaki gibi uyarlılar varsa aşağıdaki anotasyon ile düzelir.
@Inheritance(strategy = InheritanceType.JOINED)//Yukarıdaki gibi uyarılar için.
@Table(name="users")
public abstract class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;

	@Column(name="email", nullable = false, unique = true)
	private String email;
	
	@Column(name="password", nullable = false)
	private String password;
	
	@Column(name="is_active", nullable = false)
	private boolean isActive;
	public User() {}
	
	public User(int id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.isActive = false;
	}

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
		this.isActive = false;
	}
	
}
