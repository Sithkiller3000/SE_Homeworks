package HW7_Exercise2;

public class LeafTeam implements Team {

	private String name;
	private int nrOfAthletes;
	private int nrOfGoldMedals;

	public LeafTeam(String name, int nrAthletes, int nrGoldMedals) {
		this.name = name;
		this.nrOfAthletes = nrAthletes;
		this.nrOfGoldMedals = nrGoldMedals;
	}

	public String getName() {
		return this.name;
	}

	public int getNrOfAthletes() {
		return this.nrOfAthletes;
	}

	public int getNrOfGoldMedals() {
		return this.nrOfGoldMedals;
	}

	public void addGoldMedal(int nr) {
		this.nrOfGoldMedals += nr;
	}

	public void addGoldMedal() {
		this.nrOfGoldMedals++;
	}

	public void addAthlete(int nr) {
		this.nrOfAthletes += nr;
	}

	public void addAthlete() {
		this.nrOfAthletes++;
	}

	public void removeAthlete(int nr) {
		if (this.nrOfAthletes >= nr) {
			this.nrOfAthletes -= nr;
		} else {
			System.out.println("There are already less than " + nr + " Athletes in this Team. Did nothing.");
		}

	}

	@Override
	public void nameAndAthletes() {
		System.out.println("  Team: " + this.name + ", number of Athletes: " + this.nrOfAthletes);

	}

	@Override
	public void nameAndGoldMedals() {
		System.out.println("  Team: " + this.name + ", number of gold medals: " + this.nrOfGoldMedals);

	}
}
