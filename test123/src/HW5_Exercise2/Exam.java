package HW5_Exercise2;

import java.util.LinkedList;

public class Exam {

	private int maxValue;
	private int registratingDeadline;
	private int today;
	private LinkedList<Question> questions = new LinkedList<Question>();
	private LinkedList<Student> registeredStudents = new LinkedList<Student>();
	
	
	public boolean register(Student student) {
		if(today < registratingDeadline) {
			this.registeredStudents.add(student);
		}
		return today < registratingDeadline ? true : false;
	}
	
	public void addQuestion(int id, String task, int value) {
		Question question = new Question(id, task, value); 
		this.questions.add(question);	
	}
	
	public LinkedList<Student> getRegisteredStudents() {
		return this.registeredStudents;
	}
	
}
