package test.test.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import test.test.persistence.Todo;
import test.test.persistence.User;

@Stateless
public class UserService implements USerServiceLocal, UserServiceRemote {

	@PersistenceContext
	private EntityManager em;

	public UserService() {
	}

	@Override
	public void create(User user) {
		em.persist(user);

	}

	@Override
	public void AffecterTodoAUser(Integer idUser, Integer idTodo) {

		Todo t = em.find(Todo.class, idTodo);
		User u = em.find(User.class, idUser);

		t.setUser(u);

	}

	@Override
	public List<User> findAll() {
		return em.createQuery("from User", User.class).getResultList();

	}

	@Override
	public String delete(Integer idUser) {
		User u = em.find(User.class, idUser);

		if (u != null) {
			em.remove(u);
			return "removed";
		} else {
			return "not removed";
		}
	}

	@Override
	public void EditById(Integer idUser, User user) {
		// TODO Auto-generated method stub
		User u= em.find(User.class, idUser);
		
		
		//1ere methode
		u.setUsername(user.getUsername());
		u.setPassword(user.getPassword());
		u.setDate(user.getDate());
		u.setEmail(user.getEmail());		
		em.merge(u);
		
		//2eme methode
		/*user.setIdUser(u.getIdUser());		
		em.merge(user);*/
		
		
	}

	@Override
	public void Edit(User user) {
		// TODO Auto-generated method stub
		
	}

}
