package br.com.createapi.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Column(name = "email", length = 100, nullable = true)
	private String email;
	
	@Column(name = "password", columnDefinition = "TEXT", nullable = true)
	private String password;
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
