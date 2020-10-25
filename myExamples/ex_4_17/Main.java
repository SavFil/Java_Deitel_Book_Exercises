import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{
		int sum = 0;
		int counter = 1;
		int miles;	
		int gallons;
		Scanner input = new Scanner(System.in);

		do 
		{
			System.out.printf("Input miles for day %d, -1 terminate%n", counter);
			miles = input.nextInt();
			if (miles != -1)
			{
				System.out.printf("Input gallons used for day %d%n", counter);
				gallons = input.nextInt();
				
				System.out.printf("Day %d Km/l: %.2f%n", counter, miles / (double)gallons);
				sum += miles / gallons;
				if (counter > 1)
				{
					System.out.printf("Combined up to this point: %.2f km/l%n", sum / (double)counter);
				}
				counter++;
			}
		}while (miles != -1);
	}

}
