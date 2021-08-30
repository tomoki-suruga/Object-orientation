package janken;

public class RandomTactics implements Tactics {
	
	public int readTactics() {
		double hand = Math.random() * 3;

		if (hand < 1) {
			return Player.stone;
		}else if (hand < 2) {
			return Player.scissors;
		}else {
			return Player.paper;
		}
	}

}
