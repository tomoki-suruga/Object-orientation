package fantan;

import trump.Card;
import trump.Master;
import trump.Player;
import trump.Rule;
import trump.Table;

public class FantanPlayer extends Player {

	public FantanPlayer(String name, Master master, Table table, Rule rule) {
		super(name, master, table, rule);
	}
	
	@Override
	public void receiveCard(Card card) {
		if(card.getNumber() == 7) {
			table.putCard(new Card[]{card});
		}else {
			super.receiveCard(card);
		}
	}

	@Override
	public void Play(Player nextPlayer) {
		
	}

}
