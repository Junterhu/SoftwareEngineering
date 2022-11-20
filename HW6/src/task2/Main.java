package task2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		GameChair gc = new GameChair();
		BetMore_Game bet = new BetMore_Game();
		Player computer = new Player("Computer",bet);
		System.out.print("Enter your name:");
		Scanner in = new Scanner(System.in);
		Player player_2 = new Player(in.nextLine(),bet);
		gc.start(computer);
		gc.start(player_2);
		System.out.println("The winner is " + gc.findWinner(bet, computer, player_2).getName());
	}
}
