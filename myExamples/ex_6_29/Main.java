import java.util.Scanner;
import java.util.Random;


public class Main
{

	private static final Random random = new Random();
	public static enum Coin{HEADS, TAILS};
	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		int headsCount = 0;
		int tailsCount = 0;
		int menu;

		do
		{
			System.out.printf("1) Toss coin%n2)Results%n3)End%n");
			menu = input.nextInt();
			switch(menu)
			{
				case 1:
					Coin result = flip();
					if(result == Coin.HEADS) 
						headsCount++;
					else
						tailsCount++;
					System.out.println(result.toString());
					break;
				case 2:
					System.out.printf("HEADS: %d, TAILS: %d%n", headsCount, tailsCount);
					break;
				}
		}while (menu != 3);

	}

	public static Coin flip(){
		return random.nextInt(2) == 0 ? Coin.HEADS : Coin.TAILS;	
	}

}
