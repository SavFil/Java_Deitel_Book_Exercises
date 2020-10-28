import java.util.Scanner;


public class Exponential{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int number = input.nextInt() - 1;
		int pow = x;
		input.close();
		int factorial = number;
		double e = 0;
		
		if (number == 0)
			System.out.println(1);
		else if (number == 1)
			System.out.println(2);
		else
		{
			e = 1 + x;
			for (int i = 2; i <= number; i++)
			{
				pow *= x;
				factorial = i;
				for (int j = i; j > 2; j--)
					factorial *= (j - 1);

				e += pow / (double) factorial;
			}
			
			System.out.println(e);
		}
	}
}


