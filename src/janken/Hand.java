package janken;

import java.util.ArrayList;

public class Hand {
	
	private ArrayList hand = new ArrayList();
	
	public void addCard(Card card) {
		hand.add(card);
	}
	
	public Card pickCard() {
		Card pickedCard = (Card)hand.remove(0);
		return pickedCard;
	}

	public void shuffle() {
		int number = hand.size();
		int pos;
		
		for (int count = 0; count < number * 2; count++) {
			pos = (int)(Math.random() * number);
			Card puickedCard = (Card)hand.remove(pos);
			
			hand.add(puickedCard);
		}
	}
	
	public int getNumberOfCards() {
		return hand.size();
	}
	
	public Card[] findSameNuberCard() {
		
	}
}
