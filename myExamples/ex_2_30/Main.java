import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Input 5-digit integer");

		int number = input.nextInt();
		input.close();

		System.out.printf("%d   ", number / 10000);

		number = number % 10000;

		System.out.printf("%d   ", number / 1000);

		number = number % 1000;

		System.out.printf("%d   ", number / 100);

		number = number % 100;

		System.out.printf("%d   ", number / 10);

		number = number % 10;

		System.out.print(number);
	}

}
