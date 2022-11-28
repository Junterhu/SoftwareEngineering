package task1;

public interface Visitor {
	
	public void visit(Glass g);
	
	public void visit(Electronic e);
	
	public void visit(Furniture f);

}
