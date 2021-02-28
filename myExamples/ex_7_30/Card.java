public class Card{

	private final String face;
	private final String suit;

	public Card(String face, String suit)
	{
		this.face = face;
		this.suit = suit;
	}

	public String getFace()
	{
		return face;
	}

	public String getSuite()
	{
		return suit;
	}

	public String toString()
	{
		return face + " of " + suit;
	}
}
