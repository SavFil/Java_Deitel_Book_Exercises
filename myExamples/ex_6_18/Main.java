import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		int side = input.nextInt();
		char fill = input.next().charAt(0);
		input.close();

		squareOfAsterisks(side, fill);
	}

	public static void squareOfAsterisks(int side, char fill)
	{
		for(int row = 0; row < side; row++)
		{
			for (int col = 0; col < side; col++)
			{
				System.out.print(fill);
			}
			System.out.println();
		}
	}
}
