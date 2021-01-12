import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		double temp = input.nextDouble();

		System.out.printf("%f celsius to fahrenheit is %f", temp, fahrenheit(temp));
	}

	public static double celsius(double temp)
	{
		return 5.0 / 9.0 * (temp - 32);
	}

	public static double fahrenheit(double temp)
	{
		return 9.0 / 5.0 * temp + 32;
	}
}
