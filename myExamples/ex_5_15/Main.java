public class Main{

	public static void main(String[] args)
	{

		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
		System.out.println();

		for (int i = 10; i >= 1; i--)
		{
			for (int j = i; j >= 1; j--)
				System.out.print('*');
			System.out.println();
		}
		System.out.println();

		for (int i = 10; i >= 1; i--)
		{
			for (int k = 1; k <= 10 - i; k++)
				System.out.print(' ');
			for (int j = i; j >= 1; j--)
				System.out.print('*');
			System.out.println();
		}
		System.out.println();

		for (int i = 1; i <= 10; i++)
		{
			for (int k = 10 - i; k >= 1; k--)
				System.out.print(' ');
			for (int j = 1; j <= i; j++)
				System.out.print('*');
			System.out.println();
		}
	}

}
