package task2;

public abstract class Team {
	
	private String name;
	private int athleteNr;
	private int goldMedalNr;
	
	public Team(String n, int athletes, int gold) {
		name = n;
		athleteNr = athletes;
		goldMedalNr = gold;
	}
	
	

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAthleteNr() {
		return athleteNr;
	}
	public void setAthleteNr(int athleteNr) {
		this.athleteNr = athleteNr;
	}
	public int getGoldMedalNr() {
		return goldMedalNr;
	}
	public void setGoldMedalNr(int goldMedalNr) {
		this.goldMedalNr = goldMedalNr;
	}

	
}
