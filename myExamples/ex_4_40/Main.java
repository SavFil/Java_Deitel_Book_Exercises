public class Main{

	public static void main(String[] args)
	{
		System.out.printf("%15s%15s%15s%n", "Year", "Population", 
				"Increase");
		long last = 7800000000L;
		for (int i = 1; i <= 75; i++)
			System.out.printf("%15d%15d%15d%n",
					2020 + i,
					last *= 1.05,
					last - 7800000000L);


	}

}
