public class Main{

	public static void main(String[] args)
	{
		System.out.printf("%-8s%-8s%-8s%-8s%n", "N", "10*N", "100*N",
				"1000*N");
		for (int i = 1; i <= 5; i++)
		{
			System.out.printf("%-8d%-8d%-8d%-8d%n", i, i * 10,
					i * 100, i * 1000);
		}
			
	}

}
