import java.util.Scanner;

public class Main{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		System.out.print(fibonacci(n));
	}

	public static int fibonacci(int n)
	{
		int[] tmp = new int[n + 1];

		tmp[0] = 0;
		tmp[1] = 1;

		for (int index = 2; index < tmp.length; index++)
			tmp[index] = tmp[index - 1] + tmp[index - 2];

		return tmp[n];
	}
}
