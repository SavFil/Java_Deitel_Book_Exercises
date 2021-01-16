import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		int first = input.nextInt();
		int second = input.nextInt();

		System.out.printf("gcd: %d", gcd(first, second));
	}

	public static int gcd(int first, int second)
	{
		int r = -1;

		while (r != 0)
		{
			r = first % second;
			first = second;
			second = r;
		}

		return first;
	}

}
