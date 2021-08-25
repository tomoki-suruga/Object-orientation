package janken;

public class Player {
	
	public static final int stone = 0;
	public static final int scissors = 1;
	public static final int paper = 2;
	
	/**
	 * プレイヤー属性
	 */
	private String palyerName;
	private int winCount;
	
	/**
	 * コンストラクタ
	 * @param name 名前
	 */
	public Player(String name) {
		palyerName = name;
	}
	
	/**
	 * ジャンケンの手を出す
	 * @return じゃんけんの手
	 */
	public int showHand() {
		double hand = Math.random() * 3;
		if (hand < 1) {
			return stone;
		}else if (hand < 2) {
			return scissors;
		}else {
			return paper;
		}
	}
	
	/**
	 * 審判から勝った回数をきく
	 * @param result true:勝ち　false:負け
	 */
	public void notifyResult(boolean result) {
		if (result) {
			winCount++;
		}
	}
	
	/**
	 * 自分の名前を教える
	 * @return 名前
	 */
	public String getPalyerName() {
		return palyerName;
	}
	
	/**
	 * 自分の勝った回数を教える
	 * @return 勝った回数
	 */
	public int getWinCount() {
		return winCount;
	}
	
}
