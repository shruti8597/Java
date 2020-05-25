package io.javastarter.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserModal,String>{
	
}
