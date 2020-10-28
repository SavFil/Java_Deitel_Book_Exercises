import java.util.Scanner;


public class EulerNumber{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		int number = input.nextInt() - 1;
		int factorial = number;
		double e = 0;
		
		if (number == 0)
			System.out.println(1);
		else if (number == 1)
			System.out.println(2);
		else
		{
			e = 2;
			for (int i = 2; i <= number; i++)
			{
				factorial = i;
				for (int j = i; j > 2; j--)
					factorial *= (j - 1);

				e += 1 / (double) factorial;
			}
			
			System.out.println(e);
		}
	}
}


