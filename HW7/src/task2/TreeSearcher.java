package task2;

public class TreeSearcher implements Visitor {


	private enum Type {
		ATHLETES, GOLD
	}

	private Type type;

	public TreeSearcher() {
		
	}

	public void getNumberOfAthletes(OlympicsTeam ot) {
		
		type = Type.ATHLETES;
		ot.accept(this);
	}

	public void getNumberOfGoldMedals(OlympicsTeam ot) {
		type = Type.GOLD;
		ot.accept(this);
	}

	private void passOnRequest(OlympicsTeam ot) {
		ot.accept(this);
	}

	@Override
	public void visitSubTeam(SubTeam t) {
		switch (type) {
		case ATHLETES:
			System.out.println("Team: " + t.getName() + ", Number of Athletes: " + t.getAthleteNr());
			break;
		case GOLD:
			System.out.println("Team: " + t.getName() + ", Number of Gold Medals: " + t.getGoldMedalNr());
			break;
		}

	}

	@Override
	public void visitCompositeTeam(CompositeOlympicsTeam t) {
		System.out.println(t.getName());
		switch (type) {
		case ATHLETES:
			for (int i = 0; i < t.getChildren().size(); i++) {
				passOnRequest(t.getChildren().get(i));
			}
			break;
		case GOLD:
			for (int i = 0; i < t.getChildren().size(); i++) {
				;
				passOnRequest(t.getChildren().get(i));
			}
			break;
		}

	}

}
