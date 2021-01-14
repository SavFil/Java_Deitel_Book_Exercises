import java.util.Scanner;

public class Utility{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		
		int	number = input.nextInt();

		displayDigits(number);

	}

	public static int integerPartQuotient(int first, int second)
	{
		return first / second;
	}

	public static int integerPartRemainder(int first, int second)
	{
		return first % second;
	}

	public static int numOfDigits(int number)
	{
    	return (int)Math.ceil(Math.log10(number));
	}

	public static int powOfTen(int digits)
	{
		return (int)Math.pow(10, digits - 1);
	}

	public static void displayDigits(int number)
	{
		int digits = numOfDigits(number);
		int powTen = powOfTen(digits);

		for (; digits >= 1; digits--)
		{
			System.out.printf("%d ", integerPartQuotient(number, powTen));
			number = integerPartRemainder(number, powTen);
			powTen /= 10;
		}
		
	}

}
