package HW5_Exercise2;

public class Course {
	private int id;
	private String name;
	private Professor professor;
	private TA ta;
	private int currentCapacity;
	private int maxCapacity;
	private boolean isFull;
	
	
	public Course(int id, String name, int cap, Professor prof) {
		this.id = id;
		this.name = name;
		this.maxCapacity = cap;
		
	}
	
	public void enroll(Student student) {
		if(!this.isFull) {
			System.out.println("Sorry, the Course is full.");
		}else {
			currentCapacity++;
			System.out.println("You were successfully added to the Course.");
			if(currentCapacity == maxCapacity) {
				this.isFull = true;
			}
		}
	}
	
	public void apply(TA ta) {
		System.out.println("Your application was sent to the corresponding Prof.");
	}
	
	public void setMaxCap(int max) {
		if(max >= this.currentCapacity) {
			this.maxCapacity = max;
		}else {
			System.out.println("The current Capacity already exceeds this limit.");
		}
			
	}
	
	public Professor getProf() {
		return this.professor;
	}
	
	public TA getTA() {
		return this.ta;
	}
	
	public void setTA(TA ta) {
		this.ta = ta;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
