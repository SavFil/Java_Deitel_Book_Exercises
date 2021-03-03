public class Main {

	public static void main(String[] args)
	{
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();
		Card[] hand = new Card[5];

		for (int i = 0; i < hand.length; i++)
		{
			hand[i] = myDeckOfCards.dealCard();
			System.out.printf("%-19s", hand[i]);

			if ((i + 1) % 5 == 0)
			{
				System.out.println();
			}
		}
		myDeckOfCards.combinations(hand);
	}
}
