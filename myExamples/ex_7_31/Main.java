public class Main{

	public static void main(String[] args)
	{
		DeckOfCards deck = new DeckOfCards();
		deck.shuffle();

		Card[] hand1 = new Card[5];
		Card[] hand2 = new Card[5];
		int points1;
		int points2;

		for (int index = 0; index < hand1.length; index++)
		{
			hand1[index] = deck.dealCard();
			hand2[index] = deck.dealCard();
		}

		System.out.println("Player 1 hand:");
		printHand(hand1);
		points1 = deck.combinations(hand1);
		System.out.println();


		System.out.println("Player 2 hand:");
		printHand(hand2);
		points2 = deck.combinations(hand2);
		System.out.println();

		if (points1 > points2)
		{
			System.out.println("Player 1 wins");
		}
		else if (points1 < points2)
		{
			System.out.println("Player 2 wins");
		}
		else
		{
			System.out.println("Tie");
		}


	}

	public static void printHand(Card[] hand)
	{
		for (int index = 0; index < hand.length; index++)
		{
			System.out.printf("%-19s", hand[index]);
		}
		System.out.println();
	}
}
