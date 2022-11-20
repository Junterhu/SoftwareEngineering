package task2;

public class BetMore_Game {

	private Shuffle shufle;
	
	public BetMore_Game() {
		shufle = new Shuffle();
	}
	
	public int pick_card() {
		return shufle.randomNumber();
	}
	
	// The exercise didnt specify what happens in case of a draw, therefore
	// I decided to give the player the win in case of a draw
	public Player calculateWinner(Player p1, Player p2) {
		if(p1.getCard() > p2.getCard()) {
			return p1;
		} else {
			return p2;
		}
	}
}
