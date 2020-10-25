import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input name");
		String name = input.nextLine();

		System.out.println("Input last name");
		String lastName = input.nextLine();

		System.out.println("Input day month year of birth");
		int day = input.nextInt();
		int month = input.nextInt();
		int year = input.nextInt();
		input.nextLine();

		System.out.println("Input gender");
		String gender = input.nextLine();

		System.out.println("Input weight and height");
		double weight = input.nextDouble();
		double height = input.nextDouble();
		
		input.close();

		HealthProfile healthProfile = new HealthProfile(new HeartRates(name,
					lastName, new DoB(day, month, year)), gender, height,
					weight);

		System.out.printf("%s", healthProfile); 
		
		



	}

}
