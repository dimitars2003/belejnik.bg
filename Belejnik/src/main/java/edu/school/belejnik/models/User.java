package edu.school.belejnik.models;

import edu.school.belejnik.enums.Roles;

public class User {
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String address;
	private String password;
	private Roles role;
	
	public User() {
		name = "";
		email = "";
		phone = "";
		address = "";
		password = "";
		role = Roles.STUDENT;
	}
	
	public User(String name, String email, String phone, String address, String password, Roles role) {
		setName(name);
		setEmail(email);
		setPhone(phone);
		setAddress(address);
		setPassword(password);
		setRole(role);
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		if(id>=0)
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name!=null&&name.isEmpty()==false)
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email!=null&&email.isEmpty()==false)
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		if(phone!=null&&phone.isEmpty()==false)

		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if(address!=null&&address.isEmpty()==false)

		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password!=null&&password.isEmpty()==false)

		this.password = password;
	}
	public Roles getRole() {
		return role;
	}
	public void setRole(Roles role) {
		
		if(role!=null)
		this.role = role;
	}
	
}
