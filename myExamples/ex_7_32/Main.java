import java.util.ArrayList;

public class Main{

	public static void main(String[] args)
	{
		DeckOfCards deck = new DeckOfCards();
		ArrayList<Card> dealer = new ArrayList<Card>(5);
		deck.shuffle();

		for (int i = 0; i < 5; i++)
		{
			dealer.add(deck.dealCard());
			System.out.println(dealer.get(i));
		}
		Card[] dealerArray = dealer.toArray(new Card[dealer.size()]);
		deck.combinations(dealerArray);
	}
}
