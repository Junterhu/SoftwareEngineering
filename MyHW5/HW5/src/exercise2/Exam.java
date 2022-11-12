package exercise2;

import java.util.ArrayList;

public class Exam {
	
	private int maxValue;
	private ArrayList<Question> questions;
	private ArrayList<Student> students;
	private Course course;
	
	public Exam(int max, Course course) {
		maxValue = max;
		this.course = course;
		
		questions = new ArrayList<Question>();
		students = new ArrayList<Student>();
		
		//Since an exams consists out of at least one question
		addQuestion(1,"Filler",0);
	}

	public boolean register(Student student) {
		if(students.contains(student)) {
			return false;
		}
		return true;
	}
	
	public void addQuestion(int id, String task, int value) {
		questions.add(new Question(id, task, value));
	}
	
	public void setMaxValue(int max) {
		maxValue = max;
	}
}
