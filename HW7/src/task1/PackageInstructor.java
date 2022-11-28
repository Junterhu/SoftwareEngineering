package task1;

public class PackageInstructor implements Visitor {
	
	private String instructions;
	
	public PackageInstructor() {
		instructions = "";
	}
	
	public String getInstructions(HouseholdItem h) {
		h.accept(this);
		return instructions;
	}

	@Override
	public void visit(Glass g) {
		instructions = "should be packed in a box with a dimension of 1 cm larger dimensions of the item and filled with Bubble wraps.";
		
	}

	@Override
	public void visit(Electronic e) {
		instructions = "should be covered with waterproof covers with an area of the furniture";
		
	}

	@Override
	public void visit(Furniture f) {
		instructions = "should be covered with Polyethylene foam film and packed in a box with a dimension of 1 cm larger dimensions of the item.";
		
	}

}
