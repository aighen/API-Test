package com.qa.data;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//pojo - plain old java object
public class Users {

	String id;
	String employee_name;
	String employee_salary;
	String employee_age;
	String profile_image;
	
	

	public Users() {

	}

	public Users(String id, String employee_name) {
		this.id = id;
		this.employee_name = employee_name;
	}

	
	//getters and setters methods:
	public String getid() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(String employee_salary) {
		this.employee_salary = employee_salary;
	}

	public String getEmployee_age() {
		return employee_age;
	}

	public void setEmployee_agemployee_age(String employee_age) {
		this.employee_age = employee_age;
	}

	public String getProfile_image() {
		return profile_image;
	}

	public void setProfile_image(String profile_image) {
		this.profile_image = profile_image;
	
	}}
	
	
	
	


