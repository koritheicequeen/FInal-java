package Labs.week6assignment;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		deck Deck = new deck();
	Deck.MakeDeck();	
		Deck.Shuffle();
		player Player1 = new player();
		player Player2 = new player();
		System.out.println("Please input Player One's name");
		String s = "";
		s = in.nextLine();
		
		System.out.println("Player one is " + s);
		Player1.name=s;
		System.out.println("Please input Player Two's name");
		s = in.nextLine();
		System.out.println("Player Two is " + s);
		Player2.name=s;
		for(int i = card.getDeck().size(); i >0; i--) {
			if (i%2==0) {
				player.DrawPlayer(Player1);
			}
			else if (i%2==1) {
				player.DrawPlayer(Player2);
			}
		}
		for(int i = 0; i <Player1.Hand.size();) {
			String Flip1 = Player1.Flip(Player1);
			String Flip2 = Player2.Flip(Player2);
			System.out.println(Flip1 + " VS " + Flip2);
			String winner = player.incrementScore(Flip1, Player1, Flip2, Player2);
			System.out.println(winner);
			System.out.println("");
		}
		System.out.println("Final score: " + Player1.Score + " vs " + Player2.Score+ " with " + player.tieScore + " ties!");
		player winner;
		if (Player1.Score>Player2.Score) {
			winner = Player1;
		}
		else if (Player1.Score<Player2.Score) {
			winner = Player1;
		} else winner = null;
		if (winner != null) {
			System.out.println(winner.name + " Wins!");	
		} else System.out.println("Its a tie!");
	}

}
