package janken;

public class Jadge {
	
	/**
	 * ジャンケンをする
	 * @param player1
	 * @param player2
	 */
	public void startJanken(Player player1,Player player2) {
		if(player1.showHand() == player2.showHand()) {
			System.out.println("**ジャンケン開始**");
			
			for(int cnt = 0; cnt < 3; cnt++) {
				System.out.println((cnt+1)+"回目");
				Player winner = judgeJanken(player1,player2);
				
				if (winner != null) {
					System.out.println(winner.getPalyerName()+"の勝ち");
				}else {
					System.out.println("引き分け");
				}
			}
			System.out.println("**ジャンケン終了**");
			
			Player finalWinner = judgeFinalWinner(player1,player2);
			if(finalWinner != null) {
				System.out.println(finalWinner.getPalyerName());
			}else {
				System.out.println("引き分け");
			}
		}
	}
	
	/**
	 * 勝ち負けの判定
	 * @param player1
	 * @param player2
	 * @return Player 勝ったプレイヤー
	 */
	private Player judgeJanken(Player player1,Player player2) {
		int player1hand = player1.showHand();
		int player2hand = player2.showHand();
		
		printHnad(player1hand);
		System.out.print(" vs ");
		printHnad(player2hand);
		System.out.print("¥n");
		if (player1hand == player2hand) {
			return null;
		}else if((player1hand == Player.stone && player2hand == Player.scissors)
				|| (player1hand == Player.scissors && player2hand == Player.paper)
				|| (player1hand == Player.paper && player2hand == Player.stone)) {
			player1.notifyResult(true);
			return player1;
		}else {
			player2.notifyResult(true);
			return player2;
		}
	}
	
	/**
	 * 最終的な勝者の判定
	 * @param player1
	 * @param player2
	 * @return Player 勝ったプレイヤー
	 */
	private Player judgeFinalWinner(Player player1,Player player2) {
		int player1WinCount = player1.getWinCount();
		int player2WinCount = player2.getWinCount();
		
		if(player1WinCount>player2WinCount) {
			return player1;
		}else if (player2WinCount>player1WinCount) {
			return player2;
		}
			return null;
	}
	
	/**
	 * ジャンケンの手を表示
	 * @param hand　じゃんけんの手
	 */
	private void printHnad(int hand) {
		switch(hand){
		case Player.stone:
			System.out.print("ぐー");
			break;
		case Player.scissors:
			System.out.print("ちょき");
			break;
		case Player.paper:
			System.out.print("パー");
			break;	
		}
	}
	
}
