package HW6_Exercise2;


public class Game_Chair {
	
	public void start() {
		Player system = new Player("System");
		system.Play();
		Player player2 = new Player();
		player2.Play();
		Player winner = system.getBetMore_Game().findWinner(system, player2);
		
	}
	

}
