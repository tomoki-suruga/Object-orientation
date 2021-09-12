package babanuki;

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
	
	
}
