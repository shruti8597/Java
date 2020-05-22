package io.javastarter.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {
	
	private List<TodoModal> todoList = new ArrayList<TodoModal>( Arrays.asList(new TodoModal(1, "Todo 1","Todo 1 Desciption",false), 
			new TodoModal(2, "Todo 2","Todo 2 Desciption",true),
			new TodoModal(3, "Todo 3","Todo 3 Desciption",false)));
	
	public List<TodoModal> getAllTodos(){
		return this.todoList;
	}
	
	public TodoModal getTodo(int id) {
		return todoList.stream().filter(t -> t.getId() ==id).findFirst().get();
	}

	public void addTodo(TodoModal todo) {
		todoList.add(todo);
	}
	
	public void updateTodo(int id, TodoModal todo) {
		todoList = todoList.stream().map(t -> t.getId()==id ? todo : t).collect(Collectors.toList());
	}
	
	public void deleteTodo(int id) {
		todoList.removeIf(ele -> ele.getId()==id);
	}
}
