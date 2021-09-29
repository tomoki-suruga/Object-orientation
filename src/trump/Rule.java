package trump;

public interface Rule {
	public Card[] findCandidate(Hand hand,Table table);
}
