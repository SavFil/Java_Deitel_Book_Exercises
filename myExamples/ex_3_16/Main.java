import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input first and last name");
		String name = input.nextLine();
		String lastName = input.nextLine();
		
		System.out.println("Input day month year of birth");
		int day = input.nextInt();
		int month = input.nextInt();
		int year = input.nextInt();

		input.close();
		

		HeartRates person1 = new HeartRates(name, lastName, new DoB(day, month, year));
		System.out.printf("%-12s%-12s%-12s%n%-12s%-12s%-12s%n%-18s%-18d%n%-18s%-18s",
				"First Name", "Last Name", "DoB",
				person1.getFirstName(), person1.getLastName(), person1.getDoB(),
				"Max heartrate:", person1.maxHeartRate(),
				"Target heartrate:", person1.targetHeartRate());

	}
	
}
