package io.javastarter.todo;

import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<TodoModal,Integer>{
	
}
