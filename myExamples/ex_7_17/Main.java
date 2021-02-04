import java.util.Random;

public class Main{
	
	private static final Random random = new Random();
	
	public static void main(String[] args)
	{
		final int ARRAY_SIZE = 13;
		int[] frequencies = new int[ARRAY_SIZE];	

		for (int counter = 0; counter < 1000; counter++)
		{
			frequencies[sumOfDices()]++;
		}

		for (int index = 2; index < frequencies.length; index++)
		{
			System.out.printf("%-2d:%d%n", index, frequencies[index]);	
		}
	}

	public static int sumOfDices()
	{
		return (2 + random.nextInt(6) +random.nextInt(6));
	}

}
