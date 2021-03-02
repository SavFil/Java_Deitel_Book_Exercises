public class Main {

	public static void main(String[] args)
	{
		Card[] hand = new Card[5];
		DeckOfCards myDeckOfCards = new DeckOfCards();
		do{
		myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();
		hand = new Card[5];

		for (int i = 0; i <= 4; i++)
		{
			hand[i] = myDeckOfCards.dealCard();
			System.out.printf("%-19s", hand[i]);

			if (i % 4 == 0)
			{
				System.out.println();
			}
		}
		System.out.println(myDeckOfCards.checkStraight(hand));
		}
		while (!myDeckOfCards.checkStraight(hand));
	}
}
