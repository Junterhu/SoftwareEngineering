package exercise2;

import java.util.ArrayList;

public class Professor extends Employee {

	private ArrayList<Course> courses;
	
	public Professor(String name, int id, Course course) {
		super(name, id);
		courses = new ArrayList<Course>();
		
		//Since there needs to be at least one course
		courses.add(course);
	}
	
	public void publicCourse() {
		
	}
	
	public void assignTA() {
		
	}
	
	public void addCourse() {
		
	}
}
