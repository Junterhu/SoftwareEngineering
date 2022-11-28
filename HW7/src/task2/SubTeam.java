package task2;

public class SubTeam extends Team implements OlympicsTeam{
	
	public SubTeam(String n, int athletes, int gold) {
		super(n,athletes,gold);
	}
	
	@Override
	public void accept(Visitor v) {
		v.visitSubTeam(this);
	}

}
