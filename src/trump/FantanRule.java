package trump;

public class FantanRule implements Rule {

	@Override
	public Card[] findCandidate(Hand hand, Table table) {
		Card[] candidate = null;
		
		int numberOfHand = hand.getNumberOfCards();
		for (int position = 0; position < numberOfHand; position++) {
			Card lookingCard = hand.lookCard(position);
		}
		return null;
	}

}
