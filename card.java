package Labs.week6assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class card {
	private static List<String> Deck = new ArrayList<>();
	private static String[] Suits = {"Spades", "Diamond", "Heart", "Clubs"};
	
	private static String[] Values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight" , "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	private static HashMap<String, Integer> ValueCheck = new HashMap<>();

public static List<String> getDeck(){
	return Deck;
}
public static String[] getSuits(){
	return Suits;
}
public static String[] getValues(){
	return Values;
}
public static HashMap<String, Integer> ValueCheckReturn(){
	if (ValueCheck.size()<1) {
	for (String suit:Suits) {
	for (int i = 0; i<Values.length;i++) {
		ValueCheck.put(Values[i] + " of " +suit, i+2);
	}}}
	return ValueCheck;
}
public static String Describe(String card) {
	return card;
}
	
}
