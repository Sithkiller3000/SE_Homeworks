package HW7_Exercise1;

public class PriceCalculator implements Visitor {


	public void getPrice(HouseholdItem h) {
		h.accept(this);
	}

	@Override
	public void visitElectronic(Electronic e) {
		
		double cost;
		
		if(e.getFragile()) {
			int temp = (int) e.getWeight() / 10;
			cost = 5 + temp * 5;
			System.out.println("Total cost for " + e.getName() + " is: " + cost + " Euros.");
		}else {
			int temp = (int) e.getWeight() / 15;
			cost = 5 + temp * 5;
			System.out.println("Total cost for " + e.getName() + " is: " + cost + " Euros.");
		}
	}

	@Override
	public void visitFurniture(Furniture f) {
		
		int temp = (int) f.getWeight() / 20;		
		double cost = 5 + temp * 5;
		System.out.println("Total cost for " + f.getName() + " is: " + cost + " Euros.");
		
	}

	@Override
	public void visitGlass(Glass g) {
		
		double cost;

		switch(g.getTickness()) {
		case 1: 
			cost = g.getLenght() * 2;
			System.out.println("Total cost for " + g.getName() + " is: " + cost + " Euros.");
			break;
		case 2: 
			cost = g.getLenght() * 1.2;
			System.out.println("Total cost for " + g.getName() + " is: " + cost + " Euros.");
			break;
		case 3: 
			cost = g.getLenght() * 0.7;
			System.out.println("Total cost for " + g.getName() + " is: " + cost + " Euros.");
			break;
		default:
			System.out.println("Please enter an existing thickness which is either 1, 2, or 3.");
		}
		
	}
	
	
	
}
