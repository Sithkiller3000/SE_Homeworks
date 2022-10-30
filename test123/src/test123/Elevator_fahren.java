package test123;

public class Elevator_fahren {

	public static void main(String[] args) {
		Elevator test = new Elevator();
		
		
		System.out.println(test.getCurrent_state());
		System.out.println(test.getCurrent_floor());
		
		test.go_to(5, 9);
		
		

	}

}
