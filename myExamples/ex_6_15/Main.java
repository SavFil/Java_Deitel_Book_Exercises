import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		double side1 = scanner.nextDouble();
		double side2 = scanner.nextDouble();

		scanner.close();

		System.out.printf("Hypotenuse is: %.2f", hypotenuse(side1, side2));
	}

	public static double hypotenuse(double side1, double side2)
	{

		return Math.sqrt(Math.pow(side1, 2.0) + Math.pow(side2, 2.0));
	}


}
