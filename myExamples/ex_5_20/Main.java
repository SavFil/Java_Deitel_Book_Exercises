public class Main{

	public static void main(String[] args)
	{

		double pi = 4;
		int sign = -1;

		for (int counter = 3; counter <= 400003; counter += 2)
		{

			pi += sign * 4 / (double) counter;
			sign *= -1;
			System.out.println(pi);
			if ((int)(pi * 100000) == 314159){
				System.out.printf("Number of terms needed for the series to converge to 3.14159: %d", (counter + 2) / 2);
				break;
			}
		}
	}
}
