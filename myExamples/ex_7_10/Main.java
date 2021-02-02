import java.util.Scanner;
public class Main{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		final int ARRAY_LENGTH = 11;
		final int BASE_SALARY = 200;
		final float GROSSES_BONUS = .09f;
		int salary = 0;
		int sales;
		int[] counters = new int[ARRAY_LENGTH];


		System.out.println("Enter gross sales for salespersons, -1 to end");

		sales = input.nextInt();

		while (sales != -1)
		{
			salary = BASE_SALARY + (int)(sales * GROSSES_BONUS);

			if (salary >= 1000)
			{
				counters[10]++;
			}
			else
			{
				counters[salary / 100]++;
			}

			System.out.println("Enter gross sales for salespersons, -1 to end");

			sales = input.nextInt();
		}

		for (int counter = 2; counter < counters.length; counter++)
		{
			if (counter == 10)
			{
				System.out.printf("$1000 and over: %d%n", counters[counter]);
			}
			else
			{
				System.out.printf("$%d-%d: %d%n", counter * 100, counter * 100 + 99, counters[counter]);
			}
		}
	}




}
