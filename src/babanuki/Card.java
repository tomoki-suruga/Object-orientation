package babanuki;

public class Card {
	
	public static final int JOKER = 0;
	public static final int SUIT_SPADE = 1;
	public static final int SUIT_DAIMOND = 2;
	public static final int SUIT_CLUB = 3;
	public static final int SUIT_HEART = 4;
	
	public int suit;
	public int number;
	
	public Card(int suit, int number) {
		this.suit = suit;
		this.number = number;
		
	}
	
	public int getNumber() {
		return number;
	}
	
	public String toString() {
		StringBuffer string = new StringBuffer();
		
		if (number > 0) {
			switch (suit) {
				case SUIT_SPADE:
					string.append("S");
					break;
				case SUIT_DAIMOND:
					string.append("D");
					break;
				case SUIT_CLUB:
					string.append("C");
					break;
				case SUIT_HEART:
					string.append("H");
					break;
			}
			switch (number) {
				case 1:
					string.append("A");
					break;
				case 10:
					string.append("T");
					break;
				case 11:
					string.append("J");
					break;
				case 12:
					string.append("Q");
					break;
				case 13:
					string.append("K");
					break;
				default:
					string.append(number);
					break;
			}
			
		}else {
			string.append("JOKER");
		}
		
	return string.toString();
	}

}
