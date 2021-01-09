import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{

		Scanner scanner = new Scanner(System.in);

		int base = scanner.nextInt();
		int exponent = scanner.nextInt();

		System.out.println(integerPower(base, exponent));
	}

	public static int integerPower(int base, int exponent)
	{
		int result = base;

		for (int i = 1; i < exponent; i++)
			result *= base;
		return result;
	}

}
