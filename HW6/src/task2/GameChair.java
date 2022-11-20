package task2;

public class GameChair {
	
	
	
	public GameChair() {
		
	}
	
	public void start(Player p) {
		p.play();
	}
	
	public Player findWinner(BetMore_Game bet, Player computer, Player player_2) {
		return bet.calculateWinner(computer, player_2);
	}

}
