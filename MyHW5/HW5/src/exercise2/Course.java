package exercise2;

import java.util.ArrayList;

public class Course {

	private int id;
	private String name;
	private int maxCapacity;
	private boolean isFull;
	private Professor[] professors = new Professor[3];
	private ArrayList<Student> students;
	private ArrayList<TA> tas;
	private ArrayList<Exam> exams;
	private ArrayList<Project> project;
	
	
	public Course(int id, String name, int cap, Professor prof) {
		this.id = id;
		this.name = name;
		maxCapacity = cap;
		professors[0] = prof;
		
		students = new ArrayList<Student>();
		tas = new ArrayList<TA>();
		exams = new ArrayList<Exam>();
		project = new ArrayList<Project>();
		// Since there needs to be at least one exam
		exams.add(new Exam(200, this));
	}
	
	// A course can have 0 professors so, we need an additional constructor
	public Course(int id, String name, int cap) {
		this.id = id;
		this.name = name;
		maxCapacity = cap;
		
		students = new ArrayList<Student>();
		tas = new ArrayList<TA>();
		exams = new ArrayList<Exam>();
		// Since there needs to be at least one exam
		exams.add(new Exam(200, this));
	}
	
	public void enroll(Student student) {
		if(!isFull) {
			students.add(student);
			if(maxCapacity >= students.size()) {
				isFull = true;
			}
		}
	}
	
	public void apply(TA ta) {
		// I dont really know what this should do
	}
	
	public void setMaxCap(int max) {
		maxCapacity = max;
	}
	
	public Professor getProf() {
		// According to the UML there are 0-3 profs but you can only return 1
		return professors[0];
	}
	
	public TA getTA() {
		// According to the UML there can be however many TAs but you can only return 1
		return tas.get(0);
	}
	
	public void setTA(TA ta) {
		tas.add(ta);
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
