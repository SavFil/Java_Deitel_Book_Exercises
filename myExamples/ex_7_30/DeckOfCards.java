import java.util.Random;

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
			deck[count] = new Card(faces[count % 13], suits[count / 13]);
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
			first.getsuit() == fourth.getSuit() && first.getSuit() == fifth.getSuit();
	}

	public boolean checkStraight(Card first, Card second, Card third, Card fourth, Card fifth)
	{

	}

	public boolean checkFullHouse(Card first, Card second, Card third, Card fourth, Card fifth)
	{
		return checkPair(first, second) && checkThreeOfAKind(third, fourth, fifth);
	}
}
