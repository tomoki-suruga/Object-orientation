package trump;

public abstract class Player {
	
	protected String name;
	protected Master master;
	protected Table table;
	protected Hand myHand = new Hand();
	protected Rule rule;
	

	public Player(String name, Master master, Table table, Rule rule) {
		this.name = name;
		this.master = master;
		this.table = table;
		this.rule = rule;
	}
	
	public abstract void Play(Player nextPlayer);
//	{
//		Hand nextHnad = nextPlayer.showHand();
//		Card pickedCard = nextHnad.pickCard();
//		System.out.println(this + ":" + nextPlayer + "さんから" + pickedCard + "を引きました");
//		dealCard(pickedCard);
//		
//		if(myHand.getNumberOfCards() == 0) {
//			master.declareWin(this);
//		} else {
//			System.out.println(this + ":残りの手札は" + myHand + "です");
//		}
//	}
//	
//	public Hand showHand() {
//		if(myHand.getNumberOfCards() == 1) {
//			master.declareWin(this);
//		}
//		myHand.shuffle();
//		return myHand;
//	}
	
	public void receiveCard(Card card) {
		myHand.addCard(card);
//		dealCard(card);
	}
	
//	private void dealCard(Card card) {
//		myHand.addCard(card);
//		Card[] sameCards = myHand.findSameNumberCard();
//		
//		if(sameCards != null) {
//			System.out.print(this + ":");
//			table.disposeCard(sameCards);
//		}
//	}
	
	public String toString() {
		return name;
	}
}
