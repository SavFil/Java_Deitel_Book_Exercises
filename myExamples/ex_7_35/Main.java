import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int replaces = 0;
		boolean check = false;
		DeckOfCards deck = new DeckOfCards();
		ArrayList<Card> dealer = new ArrayList<Card>(5);
		ArrayList<Card> player = new ArrayList<Card>(5);
		deck.shuffle();

		for (int i = 0; i < 5; i++)
		{
			dealer.add(deck.dealCard());
			player.add(deck.dealCard());
			System.out.println(player.get(i));
		}

		System.out.println();
		while (!check)
		{
			System.out.println("1 - replace, 2 - check");
			int selection = input.nextInt();
			if (selection == 1 && replaces < 3)
			{
				System.out.println("Select card (1 - 5)");
				selection = input.nextInt();
				replaces++;
				if (replaces >= 3)
				{
					check = true;
				}
				player.set(selection - 1, deck.dealCard());

				System.out.println();
				for (int i = 0; i < 5; i++)
				{
					System.out.println(player.get(i));
				}
				System.out.println();

			}
			else
			{
				check = true;
			}

		}

		int playerPoints = deck.combinations(player.toArray(new Card[player.size()]));

		int dealerPoints = deck.evaluate(dealer);

		if (playerPoints > dealerPoints)
		{
			System.out.println("Player wins");
		}
		else if (playerPoints < dealerPoints)
		{
			System.out.println("Dealer wins");
		}
		else
		{
			System.out.println("Tie");
		}
	}
}
