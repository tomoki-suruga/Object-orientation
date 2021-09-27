package trump;

public class Player {
	
	private Master master;
	private Table table;
	private Hand myHand = new Hand();
	private String name;

	public Player(String name, Master master, Table table) {
		this.name = name;
		this.master = master;
		this.table = table;
	}
	
	public void Play(Player nextPlayer) {
		Hand nextHnad = nextPlayer.showHand();
		Card pickedCard = nextHnad.pickCard();
		System.out.println(this + ":" + nextPlayer + "さんから" + pickedCard + "を引きました");
		dealCard(pickedCard);
		
		if(myHand.getNumberOfCards() == 0) {
			master.declareWin(this);
		} else {
			System.out.println(this + ":残りの手札は" + myHand + "です");
		}
	}
	
	public Hand showHand() {
		if(myHand.getNumberOfCards() == 1) {
			master.declareWin(this);
		}
		myHand.shuffle();
		return myHand;
	}
	
	public void receiveCard(Card card) {
		dealCard(card);
	}
	
	private void dealCard(Card card) {
		myHand.addCard(card);
		Card[] sameCards = myHand.findSameNumberCard();
		
		if(sameCards != null) {
			System.out.print(this + ":");
			table.disposeCard(sameCards);
		}
	}
	
	public String toString() {
		return name;
	}
}