package test.test.services;

import java.util.List;

import javax.ejb.Remote;
import javax.jws.WebParam;
import javax.print.attribute.standard.Media;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import test.test.persistence.User;


@Remote
@Path("user")
public interface UserServiceRemote {
	
	@Path("add")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	void create(@WebParam(name="user") User user);
	
	
	@Path("All")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	List<User> findAll();

	
	@Path("delete/{idUser}")
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	String delete(@PathParam("idUser")Integer idUser);
	
	
	@Path("edit/{idUser}")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	void EditById(@PathParam("idUser")Integer idUser ,@WebParam(name="user")User user );
	
	void Edit(User user);
	
	void AffecterTodoAUser(Integer idUser , Integer idTodo );


}
