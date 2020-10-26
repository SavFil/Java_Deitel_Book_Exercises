import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		int number = 0;
		final int fiveDigits = 10000;

		while (number / fiveDigits < 1 || number / fiveDigits >= 10)
		{
			System.out.printf("Input 5-digit integer%n");
			number = input.nextInt();
		}

		input.close();

		if (number / 10000 == number % 10 &&
				(number % 10000) / 1000 == (number % 100) / 10)
		{
			System.out.printf("palindrome");
		}
		else
			System.out.printf("Not palindrome");

	}

}
