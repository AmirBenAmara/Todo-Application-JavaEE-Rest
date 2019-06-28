package test.test.persistence;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity 
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue( strategy = GenerationType.IDENTITY ) 
	private Integer idUser;
	
	private String username ; 
	private String password ; 
	private String email ; 
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@OneToMany(mappedBy="user" , fetch = FetchType.EAGER)
	private List<Todo> todoList ; 
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String username, String password, String email, Date date) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.date = date;
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", date=" + date + "]";
	}

	public List<Todo> getTodoList() {
		return todoList;
	}

	public void setTodoList(List<Todo> todoList) {
		this.todoList = todoList;
	}
	
	
	
	
	
	
	

   
}
