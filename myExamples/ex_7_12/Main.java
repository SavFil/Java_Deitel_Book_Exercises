import java.util.Scanner;
import java.util.Arrays;

public class Main{

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);

		int[] numbers = new int[5];
	    boolean duplicate = false;

		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = input.nextInt();
		
			for (int j = 0; j < numbers.length; j++)
			{
				for (int k = 0; k < j; k++)
				{
					if (numbers[k] == numbers[j])
					{
						duplicate = true;
						break;
					}
				}
				if (!duplicate && numbers[j] > 0)
				{
					System.out.println(numbers[j]);
				}

				duplicate = false;
			}

			System.out.println();

		}

		
	}

	
}

