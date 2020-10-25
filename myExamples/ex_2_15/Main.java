import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two integers");

		int first = input.nextInt();
		int second = input.nextInt();

		System.out.printf("%-12s%d%n%-12s%d%n%-12s%d%n%-12s%d",
						  "Sum: ", (first + second),
						  "Product: ", (first * second), 
						  "Difference: ", (first - second),
						  "Quotient: ", (first / second));
	}
}
