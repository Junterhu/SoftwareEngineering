package task2;

import java.util.Scanner;

public class Player {

	private String name;
	private BetMore_Game bet;
	private int card;

	public Player(String n, BetMore_Game b) {
		name = n;
		bet = b;
	}

	public void play() {
		card = bet.pick_card();
		boolean user_selected = false;
		;

		if (!name.equals("Computer")) {
			Scanner in = new Scanner(System.in);
			String decision;
			int iterations = 0;

			while (!user_selected && iterations < 5) {
				System.out.println("Your card number is: " + card);
				System.out.println("SELECT this card or PLAY new card");
				decision = in.nextLine();
				if (decision.equals("PLAY")) {
					card = bet.pick_card();
					iterations++;
				} else if (decision.equals("SELECT")) {
					user_selected = true;
				} else {
					System.out.println("Invalid Command");
					System.out.println("---------------------------------");
				}
			}
			in.close();
		}
	}
	
	public int getCard() {
		return card;
	}
	
	public String getName() {
		return name;
	}
}
