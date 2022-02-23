/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] myRanks = {"ace", "two", "three", "four", "five", "six", "seven", "eight","nine", "ten", "jack", "queen", "king"};
		String[] mySuits = {"hearts", "diamonds", "clubs", "spades"};
		int[] myValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		Deck myDeck = new Deck(myRanks, mySuits, myValues);
		System.out.println("**** Original Deck Methods ****");
		System.out.println(" toString:\n" + myDeck.toString());
		System.out.println(" isEmpty:\n" + myDeck.toString());
		System.out.println(" size: " + myDeck.size());
		System.out.println();
		System.out.println();	
		System.out.println("**** Deal a Card ****");
		System.out.println(" deal: " + myDeck.deal());
		System.out.println();
		System.out.println();
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}
}
