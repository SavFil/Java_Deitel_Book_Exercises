

import java.util.Scanner;


public class Main{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int number = input.nextInt();

		String result = Multiple.isMultiple(number, 2) ? "Even" : "odd";
		System.out.print(result);
	}

}
