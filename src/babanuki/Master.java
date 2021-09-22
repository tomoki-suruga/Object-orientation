package babanuki;

import java.util.ArrayList;

public class Master {
	public ArrayList players = new ArrayList();
	
	public void prepareGame(Hand cards) {
		System.out.println("【カードを配ります】");
		cards.shuffle();
		int numberOfCards = cards.getNumberOfCards();
		int numberOfPlayers = players.size();
		
		for(int index = 0; index < numberOfCards; index++) {
			Card card = cards.pickCard();
			
			Player player = (Player)players.get(index % numberOfPlayers);
			player.receiveCard(card);
		}
	}
	
	public void startGame() {
		System.out.println("【ババ抜きを開始します】");
		
		for (int count = 0; players.size() > 1; count++) {
			int playerIndex = count % players.size();
			int nextPlayerIndex = (count+1) % players.size();
		}
	}

}
