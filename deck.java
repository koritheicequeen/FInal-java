package Labs.week6assignment;

import java.util.Collections;
import java.util.List;

public class deck {

	public List<String> Shuffle(){
		Collections.shuffle(card.getDeck());
		
		return card.getDeck();
	}
	public void MakeDeck() {
		for (String suit: card.getSuits()) {
			for (int i = 0; i<card.getValues().length; i++) {
				card.ValueCheckReturn().put(card.getValues()[i], i+2);
				String NewCard = "";
				NewCard = card.getValues()[i]+ " of " + suit;
				card.getDeck().add(NewCard);
			}
			
		}

	}
	public static String Drawcard() {
		String Card = card.getDeck().get(0);
		card.getDeck().remove(0);
		return Card;
	}
}
