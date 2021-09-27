package trump;

public class Joker extends Card{

	public Joker() {
		super(0, 0);
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void setSuit(int suit) {
		this.suit = suit;
	}
	
	public String toString() {
		return "JK";
	}
	
}
