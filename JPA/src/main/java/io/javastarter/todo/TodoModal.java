package io.javastarter.todo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import io.javastarter.user.UserModal;

@Entity
public class TodoModal {
	
	@Id 
	private int id;
	
	@ManyToOne
	@JoinColumn(name="user_email")   
	private UserModal user;

	private String name;
	private String description;
	private Boolean completed;
	
	public TodoModal() {
		super();
	}

	public TodoModal(int id, String name, String description, Boolean completed,String userEmail) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.completed = completed;
		this.user = new UserModal(userEmail);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserModal getUser() {
		return user;
	}

	public void setUser(UserModal user) {
		this.user = user;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Boolean getCompleted() {
		return completed;
	}
	
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
	
}