package com.javalabs.services.users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.javalabs.dto.User;

@Entity
@Table(name = "users")
public class UserEntity {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private String email;
	private String password;

	public UserEntity() {}

	public UserEntity(User user) {
		this.name = user.getName();
		this.email = user.getEmail();
		this.password = user.getPassword();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return name;
	}

	public void setUserName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
