package exercise2;

import java.util.ArrayList;

public class TA{

	private ArrayList<Course> courses;
	private int id;
	private String name;
	
	public TA(int id, String name) {
		this.id = id;
		this.name = name;
		courses = new ArrayList<Course>();
		
		//Since at least one course is needed
	}
	
	public Course getCourse() {
		return courses.get(0);
	}
	
	public String getName() {
		return name;
	}
	
	public void extendContract(Course course) {
		// This is filler and not fully realizable
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
