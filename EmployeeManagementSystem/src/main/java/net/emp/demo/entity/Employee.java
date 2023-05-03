package net.emp.demo.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Employee {

	private Integer id;
	private String firstName;
	private String lastName;
	
	
}
