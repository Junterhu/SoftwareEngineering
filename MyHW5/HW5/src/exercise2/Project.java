package exercise2;

import java.util.ArrayList;

public class Project {
	
	private String name;
	private Course course;
	private ArrayList<Student> members;
	
	public Project(String name, Course course) {
		this.name = name;
		this.course = course;
		
		members = new ArrayList<Student>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addMember(Student student) {
		members.add(student);
	}
	
	public ArrayList<Student> getMembers() {
		return members;
	}
}
