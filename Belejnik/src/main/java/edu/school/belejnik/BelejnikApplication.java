package edu.school.belejnik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.school.belejnik.enums.Roles;

@SpringBootApplication
public class BelejnikApplication {

	public static void main(String[] args) {
		System.out.println(Roles.ADMIN.getRole());
		SpringApplication.run(BelejnikApplication.class, args);
	}

}
