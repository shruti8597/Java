package io.javastarter.todo;

public class TodoModal {
	private String name;
	private String description;
	private Boolean completed;
	private int id;
	
	public TodoModal() {
		super();
	}

	public TodoModal(int id, String name, String description, Boolean completed) {
		super();
		this.name = name;
		this.description = description;
		this.completed = completed;
		this.id = id;
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
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}