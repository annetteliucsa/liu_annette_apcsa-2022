package Deck;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Card.Card;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private List<Card> cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	
	public Deck(String[] myRanks, String[] mySuits, int[] myValues)
	{
		
		cards = new ArrayList<Card>();
		for(int j = 0; j < myRanks.length; j++) //go through ranks
		{
			for(String suitString : mySuits) //go through suits of ranks
			{
				Card newCard = new Card(myRanks[j], suitString, myValues[j]);
				cards.add(newCard); //add each card to deck
				
			}
		}
		size = cards.size();
		shuffle();
	}
	
	/*public Deck(String[] ranks, String[] suits, int[] values) {
		cards = new Card[ranks.length*suits.length];
		System.out.println(ranks.length +  " " + suits.length + " " + values.length);
		for(int i = 0; i < ranks.length; i++) //loop through ranks
		{
			for(int j = 0; j < suits.length; j++)//loop through suits
			{
				int cardIndex = (suits.length)* i + j; //where placing card in array
				System.out.println(i + " " + j + " " + cardIndex);
				cards[cardIndex] = new Card(ranks[i], suits[j], values[i]);
			}
		}
		size = cards.length;
		System.out.println(Arrays.toString(cards));
		shuffle();
	}
	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
	
		return size == 0;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		return size;
	}

	
	
	
	public void shuffle() {//pull random card and put it on top
		for(int k = cards.size() - 1; k > 0; k--)
		{
			int howMany = k + 1;
			int start = 0;
			int randPos = (int)(Math.random() * howMany) + start;
			Card temp = cards.get(k); 
			cards.set(k, cards.get(randPos)); // set card at index at random position
			cards.set(randPos, temp);		 //get card at random position
		}
	}
	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	/*public void shuffle() {//random
		for(int k = cards.length - 1; k > 0; k--)
		{
			int howMany = k + 1;
			int start = 0;
			int randPos = (int)(Math.random() * howMany) + start;
			Card temp = cards[k]; //ref to cards array
			cards[k] = cards[randPos];// 3 line swap // get card and assign
			cards[randPos] = temp;
			size = cards.length;
			
			
		}
	}
	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {  
//deals a card by removing it from deck and returning it if there are cards left in deck
		if(isEmpty())
		{
			return null;
		}
		size --;
		Card c = cards.get(size); //current card at top of deck 
		//Card c = cards[size];
		return c;
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
		//	rtn = rtn + cards[k];
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = size - 1; k >= 0; k--) {//cards.length , >= size
			//rtn = rtn + cards[k];
			rtn = rtn + cards.get(k);
			if (k != size-1) {
				rtn = rtn + ", ";
			}
			if ((k - cards.size()) % 2 == 0) { //k-cards.length
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}