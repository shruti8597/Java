package io.javastarter.todo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@RequestMapping("/todos")
	public List<TodoModal> getAllTodos() {
		return todoService.getAllTodos();
	}
	
	@RequestMapping("/todos/{id}")
	public Optional<TodoModal> getAllTodos(@PathVariable String id) {
		int intId = Integer.parseInt(id);
		return todoService.getTodo(intId);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/todos")
	public void addTodo(@RequestBody TodoModal Todo) {
		todoService.addTodo(Todo);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/todos")
	public void updateTodo( @RequestBody TodoModal todo) {
		todoService.updateTodo(todo);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/todos/{todoId}")
	public void deleteTodo(@PathVariable("todoId") String id) {
		int intId = Integer.parseInt(id);
		todoService.deleteTodo(intId);
	}
	
}	
