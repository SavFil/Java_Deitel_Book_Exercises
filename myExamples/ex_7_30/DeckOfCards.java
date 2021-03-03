import java.util.Random;
import java.util.Arrays;

public class DeckOfCards{

	private static final Random random = new Random();
	private static final int NUMBER_OF_CARDS = 52;

	private Card[] deck = new Card[NUMBER_OF_CARDS];
	private int currentCard = 0;

	private String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
			"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

	private String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

	public DeckOfCards() {


		for (int count = 0; count < deck.length; count++)
		{
			deck[count] = new Card(faces[count % 13], suits[count / 13], count);
		}
	}

	public void shuffle() {

		currentCard = 0;

		for (int first = 0; first < deck.length; first++)
		{
			int second = random.nextInt(NUMBER_OF_CARDS);

			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
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

	public void combinations(Card[] hand)
	{
		int length = 10;
		Card[][] p5Choose3 = {{hand[0], hand[1], hand[2]},
							  {hand[0], hand[1], hand[3]},
							  {hand[0], hand[1], hand[4]},
							  {hand[0], hand[2], hand[3]},
							  {hand[0], hand[2], hand[4]},
							  {hand[0], hand[3], hand[4]},
							  {hand[1], hand[2], hand[3]},
							  {hand[1], hand[2], hand[4]},
							  {hand[1], hand[3], hand[4]},
							  {hand[2], hand[3], hand[4]}};

		Card[][] p5Choose2 = {{hand[0], hand[1]},
							  {hand[0], hand[2]},
							  {hand[0], hand[3]},
							  {hand[0], hand[4]},
							  {hand[1], hand[2]},
							  {hand[1], hand[3]},
							  {hand[1], hand[4]},
							  {hand[2], hand[3]},
							  {hand[2], hand[4]},
							  {hand[3], hand[4]}};

		Card[][] p5Choose4 = {{hand[0], hand[1], hand[2], hand[3]},
							  {hand[0], hand[1], hand[2], hand[4]},
							  {hand[0], hand[1], hand[3], hand[4]},
							  {hand[0], hand[2], hand[3], hand[4]},
							  {hand[1], hand[2], hand[3], hand[4]}};

		Card[][] pairsOfTwo = {{hand[0], hand[1], hand[2], hand[3]},
							   {hand[0], hand[1], hand[2], hand[4]},
							   {hand[0], hand[1], hand[3], hand[4]},
							   {hand[0], hand[2], hand[1], hand[3]},
							   {hand[0], hand[2], hand[1], hand[4]},
							   {hand[0], hand[2], hand[3], hand[4]},
							   {hand[0], hand[3], hand[1], hand[2]},
							   {hand[0], hand[3], hand[1], hand[4]},
							   {hand[0], hand[3], hand[2], hand[4]},
							   {hand[0], hand[4], hand[1], hand[2]},
							   {hand[0], hand[4], hand[1], hand[3]},
							   {hand[0], hand[4], hand[2], hand[3]},
							   {hand[1], hand[2], hand[3], hand[4]},
							   {hand[1], hand[3], hand[2], hand[4]},
							   {hand[1], hand[4], hand[2], hand[3]}};



		System.out.println();

		for (int i = 0; i < length; i++)
		{
			if (checkFullHouse(p5Choose3[i][0], p5Choose3[i][1], p5Choose3[i][2], p5Choose2[length - 1 - i][0], p5Choose2[length - 1 - i][1]))
			{
				System.out.println("Full House");
			}
			else if (checkFlush(p5Choose3[i][0], p5Choose3[i][1], p5Choose3[i][2], p5Choose2[length - 1 - i][0], p5Choose2[length - 1 - i][1]))
			{
				System.out.println("Flush");
			}
			else if (i % 2 == 0 && checkFourOfAKind(p5Choose4[i / 2][0], p5Choose4[i / 2][1], p5Choose4[i / 2][2], p5Choose4[i / 2][3]))
			{
				System.out.println("FourOfAKind");
			}
			else if (checkThreeOfAKind(p5Choose3[i][0], p5Choose3[i][1], p5Choose3[i][2]))
			{
				System.out.println("ThreeOfAKind");
			}
			else if (checkPair(p5Choose2[i][0], p5Choose2[i][1]))
			{
				System.out.println("Pair");
			}
		}
		if (checkStraight(hand))
		{
			System.out.println("Straight");
		}
		for (Card[] pairsHand : pairsOfTwo){
			if (checkTwoPairs(pairsHand[0], pairsHand[1], pairsHand[2], pairsHand[3]))
			{
				System.out.println("TwoPairs");
			}
		}

	}

}
