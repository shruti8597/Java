package io.javastarter.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
	
	@Autowired
	private TodoRepository todoRepository;
	
	public List<TodoModal> getAllTodos(){
		List<TodoModal> todos = new ArrayList<TodoModal>();
		this.todoRepository.findAll().forEach(todos::add);
		return todos;
	}
	
	public Optional<TodoModal> getTodo(int id) {
		return this.todoRepository.findById(id);
	}

	public void addTodo(TodoModal todo) {
		todoRepository.save(todo);
	}
	
	public void updateTodo(TodoModal todo) {
		this.todoRepository.save(todo);
	}
	
	public void deleteTodo(int id) {
		this.todoRepository.deleteById(id);
	}
}
