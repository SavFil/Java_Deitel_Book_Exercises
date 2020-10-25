import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Input weight and height");

		double weight = input.nextDouble();
		double height = input.nextDouble();
		
		input.close();
		
		System.out.printf("%n%s%f%n%s%n%-13s%s%n%-13s%s%n%-13s%s%n%-13s%s%n", "Your BMI index: ", weight / Math.pow(height, 2.0), "BMI VALUES", "Underweight:", "less than 18.5", "Normal:", "between 18.5 and 24.9", "Overweight:", "between 25 and 29.9", "Obese:", "30 or greater");



	}

}
