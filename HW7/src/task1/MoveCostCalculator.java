package task1;

public class MoveCostCalculator implements Visitor {
	
	private double cost;
	
	public MoveCostCalculator() {
		cost = 0;
	}

	public double calculate(HouseholdItem h) {
		cost = 0;
		h.accept(this);
		return cost;
	}

	@Override
	public void visit(Glass g) {
		switch (g.getTickness()) {
		case 1:
			cost = Math.ceil((double)(g.getLength())/100.0) *2.0;
			break;
		case 2:
			cost = Math.ceil((double)(g.getLength())/100.0) *1.2;
			break;
		case 3:
			cost =Math.ceil((double)(g.getLength())/100.0) *0.7;
			break;
		}
	}

	@Override
	public void visit(Electronic e) {
		cost = 0;
		if(e.getFragile()) {
			cost = Math.ceil((double)(e.getWeight())/10.0) *5;
		} else {
			cost = Math.ceil((double)(e.getWeight())/15.0) *5;
		}		
	}

	@Override
	public void visit(Furniture f) {
		cost =  Math.ceil((double)(f.getWeight())/20.0) *5;
	}

}
