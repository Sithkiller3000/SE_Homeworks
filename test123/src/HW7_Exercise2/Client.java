package HW7_Exercise2;

public class Client {

	public static void main(String[] args) {

		CompositeTeam OlympicTeams = new CompositeTeam("Olympic Teams");

		CompositeTeam AsiasTeam = new CompositeTeam("Asia");
		CompositeTeam AfricasTeam = new CompositeTeam("Africa");
		CompositeTeam EuropesTeam = new CompositeTeam("Europe");
		CompositeTeam SouthAmericasTeam = new CompositeTeam("South America");

		OlympicTeams.addTeam(AsiasTeam);
		OlympicTeams.addTeam(AfricasTeam);
		OlympicTeams.addTeam(EuropesTeam);
		OlympicTeams.addTeam(SouthAmericasTeam);

		CompositeTeam ChinaTeam = new CompositeTeam("China");
		CompositeTeam AfghanistanTeam = new CompositeTeam("Afghanistan");
		CompositeTeam GermanyTeam = new CompositeTeam("Germany");
		CompositeTeam ItalyTeam = new CompositeTeam("Italy");

		AsiasTeam.addTeam(ChinaTeam);
		AsiasTeam.addTeam(AfghanistanTeam);
		EuropesTeam.addTeam(GermanyTeam);
		EuropesTeam.addTeam(ItalyTeam);

		CompositeTeam ChinaWomenTeam = new CompositeTeam("ChinaWomen");
		CompositeTeam ChinaMenTeam = new CompositeTeam("ChinaMen");
		CompositeTeam GermanyWomenTeam = new CompositeTeam("GermanyWomen");
		CompositeTeam GermanyMenTeam = new CompositeTeam("GermanyMen");
		CompositeTeam ItalyWomenTeam = new CompositeTeam("ItalyWomen");
		CompositeTeam ItalyMenTeam = new CompositeTeam("ItalyMen");

		ChinaTeam.addTeam(ChinaWomenTeam);
		ChinaTeam.addTeam(ChinaMenTeam);
		GermanyTeam.addTeam(GermanyWomenTeam);
		GermanyTeam.addTeam(GermanyMenTeam);
		ItalyTeam.addTeam(ItalyWomenTeam);
		ItalyTeam.addTeam(ItalyMenTeam);

		ChinaWomenTeam.addTeam("Teakwondo", 15, 2);
		ChinaWomenTeam.addTeam("Waterpolo", 3, 0);
		ChinaWomenTeam.addTeam("Artistic Gymnastics", 9, 1);
		ChinaMenTeam.addTeam("Shooting", 7, 1);

		GermanyWomenTeam.addTeam("Cycling", 10, 0);
		GermanyWomenTeam.addTeam("Tennis", 12, 1);
		GermanyMenTeam.addTeam("Table Tennis", 8, 2);
		GermanyMenTeam.addTeam("Football", 24, 1);

		ItalyWomenTeam.addTeam("Alpine Sky", 17, 3);
		ItalyMenTeam.addTeam("Football", 24, 0);
		ItalyMenTeam.addTeam("Swimming", 6, 1);

		// GermanyMenTeam.nameAndAthletes();

		// GermanyTeam.nameAndGoldMedals();

		// AsiasTeam.nameAndGoldMedals();

		OlympicTeams.nameAndAthletes();

		// ChinaWomenTeam.nameAndAthletes();

	}

}
