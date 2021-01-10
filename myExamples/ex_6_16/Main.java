import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		int first = input.nextInt();
		int second = input.nextInt();

		input.close();
		if (isMultiple(first, second))
			System.out.printf("%d is a multiple of %d", second, first);
		else
			System.out.printf("%d is not a multiple of %d", second, first);		

	}

	public static boolean isMultiple(int first, int second)
	{
		return first % second == 0 ? true : false;
	}

}
