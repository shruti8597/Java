package io.javastarter.user;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserModal {
	
	@Id
	private String email;
	private String name;
	private String mobile;
	
	public UserModal() {
		super();
	}

	public UserModal(String email, String name, String mobile) {
		super();
		this.email = email;
		this.name = name;
		this.mobile = mobile;
	}

	public UserModal(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}