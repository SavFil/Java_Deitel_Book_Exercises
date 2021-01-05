import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		int hours;
		double runningTotal = 0.00;
		do{
			System.out.printf("Enter customer's parking hours or -1 to end. ");
			hours = input.nextInt();
			
			if (hours != -1)
			{
				double charges = calculateCharges(hours);
				runningTotal += charges;
				System.out.printf("Customer's charges: %.2f$.%n%n", charges);
			}
		} while (hours != -1);
		
		input.close();
		System.out.printf("Yesterday's running total: %.2f$", runningTotal);
	}

	public static double calculateCharges(int hours)
	{
		double minimumCharge = 2.00;

		if ( hours <= 3 )
		{
			return minimumCharge;
		}
		else
		{
			int excessHours = hours - 3;
			double excessCharge = 0.50;
			double maximumCharge = 10.00;

			return Math.min(minimumCharge + excessHours * excessCharge, maximumCharge);
		}
	}
}
