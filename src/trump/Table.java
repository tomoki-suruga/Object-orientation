package trump;

import java.util.ArrayList;

public class Table {
	private ArrayList disposedCards = new ArrayList();
	
	public void disposeCard(Card card[]) {
		for(int index = 0; index < card.length; index++) {
			System.out.print(card[index]+"");
		}
		System.out.println("を捨てました");
		disposedCards.add(card);
	}
}
