package edu.school.belejnik.models;

public class Subject {
	private Long id;
	private String name;
	
	public Subject() {
		
		name = "";
	}
	
	public Subject(String name) {
		setName(name);
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
	
	
}
