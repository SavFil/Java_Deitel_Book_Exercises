import java.util.Random;
import java.util.Scanner;

public class Main{

	public static final Random random = new Random();
	
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
					correctResponse();
					question = generateQuestion();
					break;
				case WRONG:
					wrongResponse();
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

	public static int randomOneToFour()
	{
		return 1 + random.nextInt(4);
	}

	public static void correctResponse()
	{
		switch (randomOneToFour())
		{
			case 1:
				System.out.println("Very good!");
				break;
			case 2:
				System.out.println("Excellent!");
				break;
			case 3:
				System.out.println("Nice work!");
				break;
			case 4:
				System.out.println("Keep up the good work!");
				break;
		}

	}


	public static void wrongResponse()
	{

		switch (randomOneToFour())
		{

			case 1:
				System.out.println("No. Please try again.");
				break;
			case 2:
				System.out.println("Wrong. Try once more.");
				break;
			case 3:
				System.out.println("Don't give up!");
				break;
			case 4:
				System.out.println("No. Keep trying.");
				break;

		}

	}
}
