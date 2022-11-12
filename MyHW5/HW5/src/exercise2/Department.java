package exercise2;

import java.util.ArrayList;

public class Department {
	
	private ArrayList<Employee> employees;
	private ArrayList<Course> courses;
	private String name;
	
	public Department(String name) {
		this.name = name;
		
		employees = new ArrayList<Employee>();
		courses = new ArrayList<Course>();
	}
}
