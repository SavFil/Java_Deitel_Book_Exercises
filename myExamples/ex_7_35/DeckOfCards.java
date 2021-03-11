import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class DeckOfCards{

	private static final Random random = new Random();
	private static final int NUMBER_OF_CARDS = 52;

	private static final int[][] p5C3 = {{0, 1, 2},
									     {0, 1, 3},
									     {0, 1, 4},
									     {0, 2, 3},
									     {0, 2, 4},
									     {0, 3, 4},
									     {1, 2, 3},
									     {1, 2, 4},
									     {1, 3, 4},
									     {2, 3, 4}};

	private static final int[][] p5C2 = {{0, 1},
									     {0, 2},
									     {0, 3},
									     {0, 4},
									     {1, 2},
									     {1, 3},
									     {1, 4},
									     {2, 3},
									     {2, 4},
									     {3, 4}};

	private static final int[][] p5C4 = {{0, 1, 2, 3},
										 {0, 1, 2, 4},
										 {0, 1, 3, 4},
										 {0, 2, 3, 4},
										 {1, 2, 3, 4}};

	private static final int[][] pairsOfTwo = {{0, 1, 2, 3},
											   {0, 1, 2, 4},
											   {0, 1, 3, 4},
											   {0, 2, 1, 3},
											   {0, 2, 1, 4},
											   {0, 2, 3, 4},
											   {0, 3, 1, 2},
											   {0, 3, 1, 4},
											   {0, 3, 2, 4},
											   {0, 4, 1, 2},
											   {0, 4, 1, 3},
											   {0, 4, 2, 3},
											   {1, 2, 3, 4},
											   {1, 3, 2, 4},
											   {1, 4, 2, 3}};

	private Card[] deck = new Card[NUMBER_OF_CARDS];
	private int currentCard = 0;

	public DeckOfCards() {


		int cardNumber = 0;
		for (Suit suit : Suit.values())
		{
			for (Face face : Face.values())
			{
				deck[cardNumber] = new Card(face, suit, cardNumber);
				cardNumber++;
			}
		}
	}

	public void shuffle() {

		int currentCard = 0;
		ArrayList<Card> deckList = new ArrayList<Card>(Arrays.asList(deck));

		while(!deckList.isEmpty())
		{
			deck[currentCard++] = deckList.remove(random.nextInt(deckList.size()));
		}
	}

	public Card dealCard()
	{
		if (currentCard < deck.length)
		{
			return deck[currentCard++];
		}
		else {
			return null;
		}
	}

	public boolean checkPair(Card first, Card second)
	{
		return first.getFace() == second.getFace();
	}

	public boolean checkTwoPairs(Card first, Card second, Card third, Card fourth)
	{
		return checkPair(first, second) && checkPair(third, fourth);
	}

	public boolean checkThreeOfAKind(Card first, Card second, Card third)
	{
		return checkPair(first, second) && checkPair(first, third);
	}

	public boolean checkFourOfAKind(Card first, Card second, Card third, Card fourth)
	{
		return checkThreeOfAKind(first, second, third) && checkPair(first, fourth);
	}

	public boolean checkFlush(Card first, Card second, Card third, Card fourth, Card fifth)
	{
		return first.getSuit() == second.getSuit() && first.getSuit() == third.getSuit() &&
			first.getSuit() == fourth.getSuit() && first.getSuit() == fifth.getSuit();
	}

	public boolean checkStraight(Card[] hand)
	{
		int[] tmp = new int[hand.length];
		boolean check = true;

		for (int index = 0; index < tmp.length; index++)
		{
			tmp[index] = mapZeroThirteen(hand[index].getCardNumber());
		}
		Arrays.sort(tmp);

		for (int index = 0; index < tmp.length - 1; index++)
		{
			if (tmp[index] + 1 != tmp[index + 1])
			{
				check = false;
				break;
			}
		}
		return check;
	}

	public int mapZeroThirteen(int cardNumber)
	{
		return cardNumber - 13 * (cardNumber / 13);
	}


	public boolean checkFullHouse(Card first, Card second, Card third, Card fourth, Card fifth)
	{
		return checkPair(first, second) && checkThreeOfAKind(third, fourth, fifth);
	}

	public int combinations(Card[] hand)
	{
		int length = 10;
		int points = 0;



		System.out.println();

		for (int i = 0; i < length; i++)
		{
			if (checkFullHouse(hand[p5C3[i][0]], hand[p5C3[i][1]], hand[p5C3[i][2]], hand[p5C2[length - 1 - i][0]], hand[p5C2[length - 1 - i][1]]))
			{
				System.out.println("Full House");
				points = 25;
			}
			else if (checkFlush(hand[p5C3[i][0]], hand[p5C3[i][1]], hand[p5C3[i][2]], hand[p5C2[length - 1 - i][0]], hand[p5C2[length - 1 - i][1]]))
			{
				System.out.println("Flush");
				points = 20;
			}
			else if (i % 2 == 0 && checkFourOfAKind(hand[p5C4[i / 2][0]], hand[p5C4[i / 2][1]], hand[p5C4[i / 2][2]], hand[p5C4[i / 2][3]]))
			{
				System.out.println("FourOfAKind");
				points = 15;
			}
			else if (checkThreeOfAKind(hand[p5C3[i][0]], hand[p5C3[i][1]], hand[p5C3[i][2]]))
			{
				System.out.println("ThreeOfAKind");
				points = 10;
			}
			else if (checkPair(hand[p5C2[i][0]], hand[p5C2[i][1]]))
			{
				System.out.println("Pair");
				if (points == 0)
					points = 5;

			}
		}
		if (checkStraight(hand))
		{
			System.out.println("Straight");
			points = 24;
		}
		for (int i = 0; i < pairsOfTwo.length; i++){
			if (checkTwoPairs(hand[pairsOfTwo[i][0]], hand[pairsOfTwo[i][1]], hand[pairsOfTwo[i][2]], hand[pairsOfTwo[i][3]]))
			{
				System.out.println("TwoPairs");
				points = 8;
			}
		}

		return points;
	}

	public int evaluate(ArrayList<Card> hand)
	{
		int length = 10;
		int drawCard = 0;
		int points = 0;
		ArrayList<Card> tmp = new ArrayList<Card>();

		while (drawCard < 3)
		{
			for (int i = 0; i < length; i++)
			{
				if (checkPair(hand.get(p5C2[i][0]), hand.get(p5C2[i][1])))
				{
					//System.out.println("Pair");
					//System.out.printf("%-19s%-19s%-3d%-3d%n",hand.get(p5C2[i][0]).getFace(), hand.get(p5C2[i][1]).getFace(), p5C2[i][0], p5C2[i][1]);

					if (!tmp.contains(hand.get(p5C2[i][0])))
					{
						tmp.add(hand.get(p5C2[i][0]));
					}
					if (!tmp.contains(hand.get(p5C2[i][1])))
					{
						tmp.add(hand.get(p5C2[i][1]));
					}

				}
			}

			if (tmp.size() == 0)
			{
				tmp.add(hand.get(0));
				tmp.add(hand.get(1));
				tmp.add(hand.get(2));
				tmp.add(hand.get(3));
			}

			while (tmp.size() < 5)
			{
				tmp.add(dealCard());
				drawCard++;
				if (drawCard <= 3 && tmp.size() == 5)
				{
					points = combinations(tmp.toArray(new Card[tmp.size()]));
					break;
				}

			}

			hand.clear();
			hand.addAll(tmp);
			tmp.clear();
	    }
		return points;
	}
}

