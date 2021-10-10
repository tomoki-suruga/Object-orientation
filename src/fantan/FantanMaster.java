package fantan;

import trump.Master;

public class FantanMaster extends Master {
	public static final int PassLimit = 3;
	
	public void pass(FantanPlayer player) {
		System.out.println(""+player+"さんは"+player.getPass()+"回パスしました！");
		
		if(player.getPass() > PassLimit) {
			System.out.println(""+player+"さんは負けです！");
			deregisterPlayer(player);
		}
	}

}
