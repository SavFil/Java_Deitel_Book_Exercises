public class Main{

	public static void main(String[] args)
	{
		
		long factorial;

		for (int i = 1; i <= 20; i++)
		{
			factorial = i;
			for ( int j = i; j > 1; j--)
				factorial *= (j - 1);

			System.out.printf("%-20d%n", factorial);
		}
	}

}

