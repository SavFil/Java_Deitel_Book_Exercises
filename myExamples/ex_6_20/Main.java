import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		double radius = input.nextDouble();

		System.out.printf("Circle area with radius %.2f is %.2f", radius, circleArea(radius));
	}

	public static double circleArea(double radius)
	{
		return Math.PI * Math.pow(radius, 2.0);
	}

}
