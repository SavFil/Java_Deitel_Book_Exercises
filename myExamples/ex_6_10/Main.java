import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		double x = input.nextDouble();
		
		System.out.printf("%f rounded to integer: %f, rounded to tenths: %f, rounded to hundredths: %f, rounded to thousandths: %f", x, roundToInteger(x), roundToTenths(x), roundToHundredths(x), roundToThousandths(x));
		input.close();
	}
	
	public static double roundToInteger(double number)
	{

		return Math.floor(number + 0.5);
	}

	public static double roundToTenths(double number)
	{

		return Math.floor(number * 10 + 0.5) / 10;
	}

	public static double roundToHundredths(double number)
	{
		return Math.floor(number * 100 + 0.5) / 100;
	}

	public static double roundToThousandths(double number)
	{
		return Math.floor(number * 1000 + 0.5) / 1000;
	}
}
