package HW5_Exercise2;

import java.util.LinkedList;

public class Project {
	
	private String name;
	private LinkedList<Student> members = new LinkedList<Student>();
	private Course course;
	
	
	public Project(String name, Course course) {
		this.name = name;
		this.course = course;
	}	
	
	
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	
	public void addMember(Student student) {
		members.add(student);
	}
	
	public LinkedList<Student> getMembers() {
		return members;
	}

}
