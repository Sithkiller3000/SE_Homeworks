package HW6_Exercise2;


public class Game_Chair {
	
	public void start() {
		Player system = new Player("System");
		system.Play();
		Player player2 = new Player();
		player2.Play();
		//assuming the winning instance is needed for further code.
		Player winner = system.getBetMore_Game().findWinner(system, player2);
		
	}
	

}
