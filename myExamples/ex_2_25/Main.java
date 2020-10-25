import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Input an integer");

		int number = input.nextInt();
		input.close();

		System.out.printf("%n%s", Integer.lowestOneBit(number) == 1 ? "odd" : "even" );
	}

}
