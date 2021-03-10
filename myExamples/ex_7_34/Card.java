public class Card{

	private final Face face;
	private final Suit suit;
	private final int cardNumber;

	public Card(Face face, Suit suit, int cardNumber)
	{
		this.face = face;
		this.suit = suit;
		this.cardNumber = cardNumber;
	}

	public Face getFace()
	{
		return face;
	}

	public Suit getSuit()
	{
		return suit;
	}

	public int getCardNumber()
	{
		return cardNumber;
	}

	public String toString()
	{
		return face + " of " + suit;
	}
}
