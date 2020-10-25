import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Input 5 integers");

		int first = input.nextInt();
		int second = input.nextInt();
		int third = input.nextInt();
		int fourth = input.nextInt();
		int fifth = input.nextInt();

		input.close();

		System.out.printf("%n%5s%d%5s%d",
						  "Min: ", Math.min(Math.min(Math.min(fifth,fourth),third),Math.min(second,first)),
						  " Max: ", Math.max(Math.max(Math.max(fifth,fourth),third),Math.max(second,first)));
	}
}
