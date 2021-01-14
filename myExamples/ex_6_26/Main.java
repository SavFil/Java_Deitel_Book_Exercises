import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);

		int number = input.nextInt();

		System.out.print(reversed(number));
	}

	public static int reversed(int number)
	{
		int reversed = 0;
		int digits = Utility.numOfDigits(number);
		

		for (int counter = 0; counter < digits; counter++)
		{
			reversed = (reversed + number % 10) * 10;
			number /= 10;
		}
		return reversed / 10;
	}
}
