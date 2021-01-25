public class Main{

	public static void main(String[] args)
	{

		for (int decimal = 1; decimal <= 256; decimal++)
		{
			System.out.printf("%-5d%5s%5s%5s%n", decimal, Integer.toString(decimal,2), Integer.toString(decimal, 8), Integer.toString(decimal, 16));
		}
	}

}
