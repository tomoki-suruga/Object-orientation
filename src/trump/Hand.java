package trump;

import java.util.ArrayList;

public class Hand {
	
	private ArrayList hand = new ArrayList();
	
	public void addCard(Card card) {
		hand.add(card);
	}
	
	public Card pickCard(int position) {
		Card pickedCard = null;
		if((0 <= position)&&(position < hand.size())) {
			pickedCard = (Card)hand.remove(0);
		}
		return pickedCard;
	}

	public Card lookCard(int position) {
		Card lookCard = null;
		
		if ((0 <= position)&&(position < hand.size())) {
			lookCard = (Card)hand.get(position);
		}
		return lookCard;
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
	
//	public Card[] findSameNumberCard() {
//		int numberOfCards = hand.size();
//		Card[] sameCards = null;
//		
//		if(numberOfCards > 0) {
//			int lastIndex = numberOfCards - 1;
//			Card lastAddedCard = (Card)hand.get(lastIndex);
//			
//			int lastAddedCardNum = lastAddedCard.getNumber();
//			
//			for (int index = 0; index < lastIndex; index++) {
//				Card card = (Card) hand.get(index);
//				if(card.getNumber() == lastAddedCardNum) {
//					sameCards = new Card[2];
//					sameCards[0] = (Card) hand.remove(lastIndex);
//					sameCards[1] = (Card) hand.remove(index);
//					break;
//				}
//			}
//		}
//		return sameCards;
//	}
	
	public String toString() {
		StringBuffer string = new StringBuffer();
		
		int size = hand.size();
		if(size > 0) {
			for(int index = 0; index < size; index++) {
				Card card = (Card) hand.get(index);
				string.append(card);
				string.append("");
			}
		}
		return string.toString();
	}
}
