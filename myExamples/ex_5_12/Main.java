public class Main{

	public static void main(String[] args)
	{
		
		int product = 1;

		for (int i = 1; i <= 15; i++)
			product *= i % 2 == 1 ? i : 1;

		System.out.println(product);
		

	}

}
