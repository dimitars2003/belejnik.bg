package edu.school.belejnik.enums;

public enum Roles {
	TEACHER(1),
	STUDENT(2),
	PARENT(4),
	ADMIN(8);
	private int role;
	
	private Roles(int i) {
		role = i;
	}
	
	public int getRole() {
		return role;
	}
	
	
}
