package janken;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
	final static Player getPlayerInstance(String playerName) {
	    return new Player(playerName);
	  }

	public static void main(String[] args) {
		
//		String line1;
//        Scanner sc1 = new Scanner(System.in);
        Jadge saito = new Jadge();
		System.out.println("ジャンケン");
		
//        System.out.println("プレイヤー1の名前を入力してください。");
//        line1 = sc1.next();
//        Player player1 = getPlayerInstance(line1);
//        
//        System.out.println("プレイヤー2の名前を入力してください。");
//        line1 = sc1.next();
//        Player player2 = getPlayerInstance(line1);
		
		Player murata = new Player("村田さん");
		Tactics murataTactics = new StoneOnlyTactics();
		murata.setTactics(murataTactics);
		
		Player yamada = new Player("山田さん");
		Tactics yamadaTactics = new AskTactics();
		yamada.setTactics(yamadaTactics);
		
//        saito.startJanken(player1, player2);
        saito.startJanken(murata, yamada);
	}

}
