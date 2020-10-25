import java.util.Scanner;

public class Main{


	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		StringBuilder text = new StringBuilder();

		System.out.println("Enter two integers");

		int first = input.nextInt();
		int second = input.nextInt();

		if (first == second)
		{
			text.append("These numbers are equal");
		}
		else
		{
			text.append(Math.max(first, second)).append(" is larger");
		}
		System.out.printf("%n%s", text.toString());

	}

}
