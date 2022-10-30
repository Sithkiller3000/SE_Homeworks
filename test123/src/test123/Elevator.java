package test123;

public class Elevator {
	
	String Moving_up = "Moving_up";
	String Moving_down = "Moving_down";
	String Idle = "Idle";
	String current_state;
	
	int current_floor = 0;
	int destination_floor = 0;
	
	public String getCurrent_state() {
		return current_state;
	}

	public void setCurrent_state(String current_state) {
		this.current_state = current_state;
	}

	public int getCurrent_floor() {
		return current_floor;
	}

	public void setCurrent_floor(int current_floor) {
		this.current_floor = current_floor;
	}

	public Elevator() {		
			current_state = Idle;
	}
	
	public void call(int call) {
		if(call < current_floor) {
			this.moveDown(call);
		}else if(call > current_floor) {
			this.moveUp(call);
		}
	}
	
	public void go_to(int destination, int passenger_floor) {
		if(current_floor != passenger_floor) {
			this.call(passenger_floor);
		}
		if(destination < current_floor) {
			this.moveDown(destination);
		}else if(destination > current_floor) {
			this.moveUp(destination);
		}
	}
	
	public void moveUp(int destination) {
		while(current_floor < destination) {
			this.current_state = this.Moving_up;
			System.out.println("Moving up, we are now at floor: " +current_floor);
			current_floor += 1;
		}
		this.current_state = this.Idle;
		System.out.println("We are now at your destination at floor: " +current_floor);
	}
	
	public void moveDown(int destination) {
		while(current_floor > destination) {
			this.current_state = this.Moving_down;
			System.out.println("Moving down, we are now at floor: " +current_floor);
			current_floor -= 1;
		}
		this.current_state = this.Idle;
		System.out.println("We are now at your destination at floor: " +current_floor);
	}
}
