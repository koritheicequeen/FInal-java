package Labs.week6assignment;

import java.util.ArrayList;
import java.util.List;

public class player {
	public List<String> Hand = new ArrayList<>();
	public int Score=0;
	public String name;
	public static int tieScore=0;
	
	public void DescribeHand() {
		
	}
public static String incrementScore(String card1, player player1, String card2, player player2) {
	int Card1 = card.ValueCheckReturn().get(card1);
	int Card2 =  card.ValueCheckReturn().get(card2);
	if (Card1>Card2) {
		player1.Score +=1;
		return player1.name+ " wins";
	}
	else if (Card2>Card1) {
		player2.Score +=1;
		return player2.name +" wins";
	}
	else {
		tieScore +=1;
		return "Both Players Tie";
	}
}
public static void DrawPlayer(player Player) {
	
	Player.Hand.add(deck.Drawcard());
}
public String Flip(player Player) {
	String card = Player.Hand.get(0);
	Player.Hand.remove(0);
	return card;
}
public void DescribePlayer(player Player) {
	System.out.println(Player.name);
	System.out.println(Player.Score);
	StringBuilder HandPrint = new StringBuilder();
	for(String Card : Player.Hand) {
		String card2 = card.Describe(Card);
		HandPrint.append(card2+" ");
	}
	System.out.println(HandPrint);
}

}
