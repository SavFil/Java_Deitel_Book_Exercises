import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int largest1 = -1;
		int largest2 = -1;
		int number;

		for (int counter = 1; counter <= 10; counter++)
		{
			System.out.printf("Input the #%d number: ", counter);
			number = input.nextInt();
			System.out.println();

			largest2 = number > largest2 && largest1 > largest2 ? largest1 : largest2;
			largest1 = number > largest1 ? number : largest1;
		}
		System.out.printf("Largerst: %d, Second Largest: %d", 
				largest1, largest2);

	}

}
