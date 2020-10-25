import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{
		int largest = -1;
		Scanner input = new Scanner(System.in);
		int number;

		for (int counter = 1; counter <= 10; counter++)
		{
			System.out.printf("Enter the #%d number: ", counter);
			number = input.nextInt();
			System.out.println();
			
			largest = number > largest ? number : largest; 

		}

		System.out.printf("Largest integer is: %d", largest);
	}

}
