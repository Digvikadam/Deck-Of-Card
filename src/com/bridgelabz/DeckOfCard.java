package com.bridgelabz;

public class DeckOfCard {
	 //Deck of Cards program
	public static void main(String[] args) {
		// Initialising the suits ,rank,cardsCollection
		String[][] cardsCollection = new String[4][13];
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		// creating object to access createcard()
		DeckOfCard deckofcard = new DeckOfCard();
		deckofcard.createCards(suits, ranks, cardsCollection);
	}
	//Create all cards and storing values in Array
	public void createCards(String[] suit, String[] ranks, String[][] cardsCollection) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cardsCollection[i][j] = (suit[i] + "-" + ranks[j]);

			}

		}

	}

}

