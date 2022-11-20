package HW6_Exercise2;

public class Player {
		
	private String name;
	private int card;
	private int trys = 0;
	private static BetMore_Game bmg = new BetMore_Game();
	
	public Player() {
		
	}
	
	public Player(String name) {
		this.name = name;
	}
	
	public int Play() {
		int x = bmg.play();
		if(trys <= 5) {
			this.card = x;
			System.out.println("Sie haben schon alle Versuche aufgebraucht.");
		}
		this.trys++;
		return x;
	}

	public int getCard() {
		return card;
	}
	
	public BetMore_Game getBetMore_Game() {
		return Player.bmg;
	}

	public void resetTrys() {
		this.trys = 0;
	}
	
}
