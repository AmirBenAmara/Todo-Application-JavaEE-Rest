package test.test.util;

import java.util.Date;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import test.test.persistence.Todo;
import test.test.persistence.User;
import test.test.services.TodoServiceLocal;
import test.test.services.USerServiceLocal;

@Singleton
@Startup
public class DBPopulator {
	

	private static final Logger LOGGER = Logger.getLogger(DBPopulator.class.getName());

	@EJB
	private TodoServiceLocal todoServiceLocal;
	
	@EJB
	private USerServiceLocal userservicelocal ; 
	
	
	public DBPopulator() {
	}
	
	@PostConstruct
	public void init(){
		Todo t1 = new Todo("Learn JSF");
		Todo t2 = new Todo("Learn EJB");
		Todo t3 = new Todo("Learn JPA");
		todoServiceLocal.create(t1);
		todoServiceLocal.create(t2);
		todoServiceLocal.create(t3);
		
		User u1 = new User("ahmed", "0000", "ahmed@ahmed.tn", new Date("01/01/2010"));
		User u2 = new User("achref", "0000", "achref@achref.tn", new Date("01/02/2016"));
		//userservicelocal.create(u1);
		//userservicelocal.create(u2);
		
		//userservicelocal.AffecterTodoAUser(1,1);
		
		
		//userservicelocal.delete(1);
		//User u1 = new User("salah", "0000", "salah@salah.tn", new Date("01/01/2010"));
		//userservicelocal.create(u1);
		
		//userservicelocal.delete(3);

		
	}
}
