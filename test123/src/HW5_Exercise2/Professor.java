package HW5_Exercise2;

import java.util.LinkedList;

public class Professor extends Employee{
	
	private LinkedList<Course> courses = new LinkedList<Course>();
	
	public Professor(String name, int employeeId, Course course) {
		super(name,employeeId);
		this.courses.add(course);
	}

	public void publicCourse() {
		
	}
	
	public void assignTA(TA ta, Course Course) {
		Course.setTA(ta);
	}
	
	public void addCourse(int id, String name, int cap, Professor prof) {
		Course lol = new Course(id, name, cap, prof);
	}
}
