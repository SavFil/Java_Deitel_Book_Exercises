public class Card{

	private final String face;
	private final String suit;
	private final int cardNumber;

	public Card(String face, String suit, int cardNumber)
	{
		this.face = face;
		this.suit = suit;
		this.cardNumber = cardNumber;
	}

	public String getFace()
	{
		return face;
	}

	public String getSuit()
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
