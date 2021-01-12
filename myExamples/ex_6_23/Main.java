import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		double first = input.nextDouble();
		double second = input.nextDouble();
		double third = input.nextDouble();

		System.out.printf("Minimum is: %f", minimum3(first, second, third));
	}

	public static double minimum3(double first, double second, double third)
	{
		return Math.min(Math.min(first, second), third);
	}
}
