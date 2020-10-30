import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		int count = input.nextInt();
		int number;
		int min = 0;

		for (int i = 0; i < count; i++)
		{
			number = input.nextInt();
			if (i == 0)
			{
				min = number;
				continue;
			}
			if (number < min)
				min = number;

		}
		System.out.println(min);
	}

}
