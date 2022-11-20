package HW6_Exercise2;

public class BetMore_Game {
	
	
	
	public int play() {
		Shuffle s = new Shuffle();
		return s.pick_card();
	}
	
	public Player findWinner(Player system, Player player) {
		if(system.getCard() < player.getCard()) {
			System.out.println("Herzlichen Glückwunsch, Sie haben gewonnen!");
			return player;
		}else {
			System.out.println("Schade, Sie haben leider verloren, vielleicht bei einem anderen Versuch.");
			return system;
		}
	}

}
