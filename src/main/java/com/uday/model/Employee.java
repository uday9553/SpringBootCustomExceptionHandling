package com.uday.model;

import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Table
public class Employee {
	private Integer employeeId;
	 
	@NotNull(message = "first name must not be empty")
    private String firstName;
 
    @NotEmpty(message = "last name must not be empty")
    private String lastName;
 
    @NotEmpty(message = "email must not be empty")
    @Email(message = "email should be a valid email")
    private String email;

	public Employee(Integer employeeId,String firstName,String lastName,String email) {		
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public Employee() {
		
	}
}
