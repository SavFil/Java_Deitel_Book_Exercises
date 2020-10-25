import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input radius of circle: ");
		double radius = input.nextDouble();

		input.close();
		

		System.out.printf("%n%-17s%f%n%-17s%f%n%-17s%f",
						  "diameter = ", 2 * radius,
						  "circumference = ", 2 * Math.PI * radius,
						  "area = ", Math.PI * Math.pow(radius, 2));
	}
}
