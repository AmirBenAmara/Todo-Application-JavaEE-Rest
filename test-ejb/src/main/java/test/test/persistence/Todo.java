package test.test.persistence;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

@Entity 
@Table(name="t_todo") //optionelle 
public class Todo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id // primary key 
	@GeneratedValue( strategy = GenerationType.IDENTITY ) //auto increment
	private Integer id;
	
	
	@Column(name="")
	private String text;
	
	@ManyToOne
	private User user ; 

	public Todo() {
		
		
	}   
	
	public Todo(String text) {
		this.text = text;
	}

	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
   
}
