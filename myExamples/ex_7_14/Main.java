import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{
		product(2);
		product(2, 4);
		product(2, 4, 5);
		product(2, 4, 5, 2);
		product(2, 4, 5, 2, 4);
		product(2, 4, 5, 2, 4, 5);
	}

	public static void product(int... numbers)
	{
		int	product = 1;

		for (int num : numbers)
		{
			product *= num;
		}
		
		System.out.println(product);
	}
}
