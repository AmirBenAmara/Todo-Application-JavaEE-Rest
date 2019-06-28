package test.test.services;

import java.util.List;

import javax.ejb.Local;

import test.test.persistence.Todo;

@Local // si on va consommer le service dans le serveur 
public interface TodoServiceLocal {
	
	void create(Todo todo);
	List<Todo> findAll();
}
