package io.javastarter.todo;

import java.util.List;

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
	
	@RequestMapping("/users/{email}/todos")
	public List<TodoModal> getAllTodos(@PathVariable String email) {
		return todoService.getAllTodos(email);
	}
	
	@RequestMapping("/users/{email}/todos/{id}")
	public TodoModal getTodo(@PathVariable String email,@PathVariable String id) {
		int intId = Integer.parseInt(id);
		return todoService.getTodo(email,intId);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/users/todos")
	public void addTodo(@RequestBody TodoModal todo) {
		todoService.addTodo(todo);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/users/todos")
	public void updateTodo(@RequestBody TodoModal todo) {
		todoService.updateTodo(todo);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/users/{email}/todos/{todoId}")
	public void deleteTodo(@PathVariable String email,@PathVariable("todoId") String id) {
		int intId = Integer.parseInt(id);
		todoService.deleteTodo(email,intId);
	}
	
}	
