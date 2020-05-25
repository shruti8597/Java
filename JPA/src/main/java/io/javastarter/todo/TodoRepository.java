package io.javastarter.todo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<TodoModal,Integer>{
	
	public List<TodoModal> findByUserEmail(String email);
	
	public TodoModal findByUserEmailAndId(String email,int id);
	
	@Transactional
	@Modifying
    @Query("delete from TodoModal u where u.user.email = ?1 and u.id = ?2")
	public void removeByUserEmailAndId(String email,int id);
}
