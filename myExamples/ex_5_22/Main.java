public class Main{

	public static void main(String[] args)
	{

		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			for (int k = 10 - i; k >= 1; k--)
				System.out.print(' ');
			for (int j = 10 - i; j >= 1; j--)
				System.out.print('*');
			for (int j = 1; j <= i; j++)
				System.out.print(' ');
			for (int j = 1; j <= i; j++)
				System.out.print(' ');
			for (int j = 10 - i; j >= 1; j--)
				System.out.print('*');
			for (int j = 10 - i; j >= 1; j--)
				System.out.print(' ');
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}	
	}

}
