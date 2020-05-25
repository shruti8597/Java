package io.javastarter.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepository todoRepository;
	
	public List<TodoModal> getAllTodos(String email){
		List<TodoModal> todos = new ArrayList<TodoModal>();
		this.todoRepository.findByUserEmail(email).forEach(todos::add);
		return todos;
	}
	
	public TodoModal getTodo(String email,int id) {
		return this.todoRepository.findByUserEmailAndId(email,id);
	}

	public void addTodo(TodoModal todo) {
		todoRepository.save(todo);
	}
	
	public void updateTodo(TodoModal todo) {
		this.todoRepository.save(todo);
	}
	
	public void deleteTodo(String email, int id) {
		this.todoRepository.removeByUserEmailAndId(email,id);
	}
}
