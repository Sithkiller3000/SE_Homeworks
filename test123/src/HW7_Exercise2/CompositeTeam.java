package HW7_Exercise2;

import java.util.ArrayList;
import java.util.List;

public class CompositeTeam implements Team {

	private List<Team> subteams = new ArrayList<Team>();

	private String name;

	public CompositeTeam(String name) {
		this.name = name;
	}

	public void addTeam(String name, int nrAthletes, int nrGoldMedals) {
		LeafTeam lol = new LeafTeam(name, nrAthletes, nrGoldMedals);
		subteams.add(lol);
	}

	public void addTeam(Team t) {
		subteams.add(t);
	}

	public void removeTeam(Team t) {
		subteams.remove(t);
	}

	public List<Team> getSubTeams() {
		return this.subteams;
	}

	@Override
	public void nameAndAthletes() {
		for (Team t : subteams) {
			if (t instanceof LeafTeam) {
				System.out.print("-" + this.name);
				System.out.println();
				break;
			}
		}
		for (Team t : subteams) {
			if (this instanceof CompositeTeam) {
				if (t instanceof CompositeTeam) {
					System.out.println();
					System.out.print("-" + this.name);
				}
			}
			t.nameAndAthletes();
		}

	}

	@Override
	public void nameAndGoldMedals() {
		for (Team t : subteams) {
			if (t instanceof LeafTeam) {
				System.out.print("-" + this.name);
				System.out.println();
				break;
			}
		}
		for (Team t : subteams) {
			if (this instanceof CompositeTeam) {
				if (t instanceof CompositeTeam) {
					System.out.println();
					System.out.print("-" + this.name);
				}
			}
			t.nameAndGoldMedals();
		}
	}

}
