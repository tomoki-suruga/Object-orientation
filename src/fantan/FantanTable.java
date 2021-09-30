package fantan;

import trump.Card;
import trump.Table;

public class FantanTable implements Table {
	
	private Card[][] table = new Card[Card.SUIT_NUM][Card.CARD_NUM];

	@Override
	public void putCard(Card[] card) {
		// TODO 自動生成されたメソッド・スタブ
		int number = card[0].getNumber();
		int suit = card[0].getSuit();
		
		table[suit-1][number-1] = card[0];
	}

	@Override
	public Card[][] getCards() {
		// TODO 自動生成されたメソッド・スタブ
		Card[][] copyTable = new Card[Card.SUIT_NUM][Card.CARD_NUM];
		for(int suit = 0; suit < Card.SUIT_NUM; suit++) {
			System.arraycopy(table[suit],0,copyTable[suit],0,Card.CARD_NUM);
		}
		return copyTable;
	}
	
	public String toString() {
		StringBuffer tableString = new StringBuffer(200);
		for(int suit = 0; suit < Card.SUIT_NUM; suit++) {
			for(int number = 0; number < Card.CARD_NUM; number++) {
				if(table[suit][number] != null) {
					tableString.append(table[suit][number]);
				}else {
					tableString.append("..");
				}
				tableString.append("  ");
			}
			tableString.append("¥n");
		}
		
		return tableString.toString();
	}

}
