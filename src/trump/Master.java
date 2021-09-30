package trump;

import java.util.ArrayList;

public class Master {
	public ArrayList players = new ArrayList();
	
	public void prepareGame(Hand cards) {
		System.out.println("【カードを配ります】");
		cards.shuffle();
		int numberOfCards = cards.getNumberOfCards();
		int numberOfPlayers = players.size();
		
		for(int index = 0; index < numberOfCards; index++) {
			Card card = cards.pickCard(0);
			
			Player player = (Player)players.get(index % numberOfPlayers);
			player.receiveCard(card);
		}
	}
	
	public void startGame() {
		System.out.println("【ゲームを開始します】");
		
		for (int count = 0; players.size() > 1; count++) {
			int playerIndex = count % players.size();
			int nextPlayerIndex = (count+1) % players.size();
			
			Player player = (Player) players.get(playerIndex);
			Player nextPlayer = (Player)players.get(nextPlayerIndex);
			
			System.out.println(player + "さんの番です");
			player.Play(nextPlayer);
		}
		System.out.println("【ババ抜きは終了しました】");
	}
	
	public void declareWin(Player winner) {
		System.out.println(winner + "さんが上がりました");
		
		players.remove(players.indexOf(winner));
		
		if (players.size() == 1) {
			Player loser = (Player) players.get(0);
			System.out.println(loser + "さんの負けです");
		}
	}
	
	public void registerPlayer(Player player) {
		players.add(player);
	}
	
	public void deregisterPlayer(Player player) {
		players.remove(players.indexOf(player));
		if (players.size() == 1) {
			Player loser = (Player)players.get(0);
			System.out.println(" " + loser + "さんの負け" );
		}
	}

}
