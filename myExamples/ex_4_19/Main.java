import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{
		double sum = 200;
		int INPUT_END = -1;	
		double input;
		Scanner scanner = new Scanner(System.in);

		do
		{
			System.out.printf("Input price of next item, or -1 to end%n");
			input = scanner.nextDouble();
			if (input != INPUT_END)
				sum += (input * 0.05);	
		}while (input != INPUT_END);
		
		scanner.close();
		System.out.printf("Earnings for this week: %.2f", sum);

	}

}
