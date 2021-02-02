import java.util.Arrays;

public class Main{

	public static void main(String[] args)
	{

		int[] counts = new int[10];
		Arrays.fill(counts, 0);
		
		int[] bonus = new int[15];

		for (int counter = 0; counter < bonus.length; counter++)
		{
			bonus[counter]++;
		}

		int[] bestScores = { 3, 4, 1, 5, 2 };

		for (int b : bestScores)
		{
			System.out.println(b);
		}

	}
}
