package exercise2;

import java.util.ArrayList;

public class Student {
	
	private int id;
	private String name;
	private ArrayList<Exam> exams;
	private ArrayList<Course> courses;
	private Project project;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		
		exams = new ArrayList<Exam>();
		courses = new ArrayList<Course>();
	}
	
	public String getName() {
		return name;
	}
	
	public Project getProject() {
		return project;
	}
}
