package io.javastarter.todo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
	
	@RequestMapping("/todos")
	public List<TodoModal> getAllTodos() {
		return Arrays.asList(new TodoModal(1, "Todo 1","Todo 1 Desciption",false), 
					new TodoModal(2, "Todo 2","Todo 2 Desciption",true),
					new TodoModal(3, "Todo 3","Todo 3 Desciption",false));
	}
	
}	
