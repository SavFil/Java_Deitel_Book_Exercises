import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s%n%s%n%s%n%n%-36s","*******************************","* Car-Pool Savings Calculator *", "*******************************", "Input total km driven per day: ");
		double kmPerDay = input.nextDouble();

		System.out.printf("%-36s", "Cost per litter of gasoline:");
		double costPerLiter = input.nextDouble();

		System.out.printf("%-36s", "Average km per liter:");
		double avgKmPerLiter = input.nextDouble();

		System.out.printf("%-36s", "Parking fees per day:");
		double parkingFees = input.nextDouble();

		System.out.printf("%-36s", "Tolls per day:");
		double tollsPerDay = input.nextDouble();

		input.close();

		System.out.printf("%n%n%-36s%.2f%s", "Total cost driving to work per day:",
				          (kmPerDay / avgKmPerLiter) * costPerLiter + parkingFees + tollsPerDay, " Euro");
		
		
	}

}
