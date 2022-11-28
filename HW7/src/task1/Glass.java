package task1;

public class Glass implements HouseholdItem{
	
	String name;
	int length;
	int width;
	int height;

	int tickness;

	
	public Glass(String name, int lenght, int width, int height, int tickness) {
		this.name = name;
		this.length = lenght;
		this.width = width;
		this.height = height;
		this.tickness = tickness;
	
	}

	
	@Override
	public void accept(Visitor v) {
		v.visit(this);
		
	}
	
	@Override
	public String getPrintable() {
		return name;
	}


//Getters and Setters =

	public int getHeight() {
		return height;}

	public void setHeight(int height) {
		this.height = height;}

	public int getLength() {
		return length;}

	public void setLength(int lenght) {
		this.length = lenght;}

	public int getWidth() {
		return width;}

	public void setWidth(int width) {
		this.width = width;}

	public Integer getTickness() {
		return tickness;}

	public void setTickness(int tickness) {
		this.tickness = tickness;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	
	


}
