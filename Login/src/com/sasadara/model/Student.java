package com.sasadara.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class Student {
	//com.sasadara.model.Student.stuid, referenced property unknown: com.sasadara.model.salt.Student

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="firstName")
	private String firstName1;
	
	@Column(name="middleName")
	private String middleName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="email")
	public String email;
	
	@Column(name="userId")
	public String userId;
	
	@Column(name="password")
	public String password;
	
	@Column(name="Role")
	public String Role;
	
	//@OneToOne(mappedBy="Student", 
			//cascade={CascadeType.ALL})
	/*private salt stuid;
	
	

	public salt getStuid() {
		return stuid;
	}

	public void setStuid(salt stuid) {
		this.stuid = stuid;
	}*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName1() {
		return firstName1;
	}

	public void setFirstName1(String firstName1) {
		this.firstName1 = firstName1;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public Student() {
		
	}

	public Student(String firstName1, String middleName, String lastName, String email, String userId, String password,
			String role) {
		super();
		this.firstName1 = firstName1;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.userId = userId;
		this.password = password;
		Role = role;
	}


	

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName1 + ", lastName=" + lastName + ", email=" + email + "]";
	}
	
}
					


