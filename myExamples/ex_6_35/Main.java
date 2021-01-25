import java.util.Random;
import java.util.Scanner;

public class Main{

	public static Random random = new Random();
	
	private enum  Status {CORRECT, WRONG};

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		Status status;
		int question = generateQuestion();

		while(true)
		{		
			int answer = input.nextInt();
			
			status = answer == question ? Status.CORRECT : Status.WRONG;
			switch (status)
			{
				case CORRECT:
					System.out.println("Very Good!");
					question = generateQuestion();
					break;
				case WRONG:
					System.out.println("No. Please try again.");
				 	break;	
			}
		}
	}
	
	public static int generateQuestion()
	{
		int number1 = random.nextInt(10);
		int number2 = random.nextInt(10);

		System.out.printf("How much is %d times %d?%n", number1, number2);

		return number1 * number2;
	}
}
