import java.util.Arrays;
public class Main{

	public static void main(String[] args)
	{

		boolean[] sieve = new boolean[1000];

		Arrays.fill(sieve, true);
		for (int index = 2; index < sieve.length; index++)
		{
			if (sieve[index])
			{
				for (int next = index + 1; next < sieve.length; next++)
				{
					if (next % index == 0)
					{
						sieve[next] = false;
					}
				}
			}
		}
		printPrimes(sieve);
	}

	public static void printPrimes(boolean[] array)
	{
		int newLineTrigger = 0;

		for (int counter = 2; counter < array.length; counter++)
		{
			if(array[counter])
			{
				System.out.printf("%-4d", counter);
				newLineTrigger++;

				if (newLineTrigger % 5 == 0)
				{
					System.out.println();
				}
				if (newLineTrigger % 25 == 0)
				{
					System.out.println();
				}
			}
		}
	}

}
