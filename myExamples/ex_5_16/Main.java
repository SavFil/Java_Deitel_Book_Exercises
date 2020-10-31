import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		int number4 = input.nextInt();
		int number5 = input.nextInt();

		for (int i = 0; i < number1; i++)
			System.out.print('*');
		System.out.println();
		for (int i = 0; i < number2; i++)
			System.out.print('*');
		System.out.println();
		for (int i = 0; i < number3; i++)
			System.out.print('*');
		System.out.println();
		for (int i = 0; i < number4; i++)
			System.out.print('*');
		System.out.println();
		for (int i = 0; i < number5; i++)
			System.out.print('*');

	}

}
