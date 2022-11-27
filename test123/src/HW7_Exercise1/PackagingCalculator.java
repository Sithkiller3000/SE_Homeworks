package HW7_Exercise1;

public class PackagingCalculator implements Visitor {
	
	public void getPackaging(HouseholdItem h) {
		h.accept(this);
	}

	@Override
	public void visitElectronic(Electronic e) {
		System.out.println(e.getName() + ":");
		System.out.println(">should be covered with Polyethylene foam film and packed in a box with dimension: "
							+ (e.getHeight()+1) + "x" + (e.getLenght()+1) + "x" + (e.getWidth()+1));
	}

	@Override
	public void visitFurniture(Furniture f) {
		System.out.println(f.getName() + ":");
		System.out.println(">should be covered with waterproof covers with area of: "
							+ f.getLenght() + "x" + f.getWidth());

	}

	@Override
	public void visitGlass(Glass g) {
		System.out.println(g.getName() + ":");
		System.out.println(">should be covered with Bubble wraps and packed in a box with dimension: "
							+ (g.getHeight()+1) + "x" + (g.getLenght()+1) + "x" + (g.getWidth()+1));

	}

}
