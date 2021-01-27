import java.util.Random;
import java.util.Scanner;

public class Main{

	public static final Random random = new Random();
    private static int tries = 0;	
	private static int level = 10;
	private static int type;
	private enum  Status {CORRECT, WRONG, RESET};
	private static final int ADDITION = 1;
	private static final int SUBTRACTION = 2;
	private static final int MULTIPLICATION = 3;
	private static final int DIVISION = 4;
	private static final int MIXED = 5;

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);


		System.out.printf("Computer-Assisted Instruction%nDifficulty level: %d%n1: Addition%n2: Subtraction%n3: Multiplication%n4: Division%n5: Mixed%nPlease input your choice", unitsToLevel());
		type = input.nextInt();

		Status status = Status.CORRECT;
		int correctAnswers = 0;
		int question = 0;
		int answer; 
		while(true)
		{		
			
			if (tries < 10 && status == Status.CORRECT)
				question = generateQuestion();
			if (tries == 10){
				status = Status.RESET;
			}
			else{
				tries++;
				answer = input.nextInt();
				status = answer == question ? Status.CORRECT : Status.WRONG;
			}

			switch (status)
			{
				case CORRECT:
					correctAnswers++;
					correctResponse();
					break;
				case WRONG:
					wrongResponse();
					break;
				case RESET:
					tries = 0;
					status = Status.CORRECT;
					showFeedback(correctAnswers);
					setLevel(correctAnswers);
					System.out.printf("Correct %d out of 10.%n%n", correctAnswers);
					System.out.printf("Computer-Assisted Instruction%nDifficulty level: %d%n1: Addition%n2: Subtraction%n3: Multiplication%n4: Division%n5: Mixed%nPlease input your choice", unitsToLevel());
					type = input.nextInt();
					correctAnswers = 0;
					break;
			}
		}
	}

	public static int unitsToLevel()
	{
		return (int)Math.log10(level);
	}


	public static void showFeedback(int correct)
	{

		if (correct < 8)
			System.out.println("Please ask your teacher for extra help.");
		else
			System.out.println("Congratulations, you are ready to go to the next level!");
	}

	public static void setLevel(int correct)
	{
		if (correct >= 8)
			level *= 10;
	}
	
	
	public static int generateQuestion()
	{
		int number1 = random.nextInt(level);
		int number2 = random.nextInt(level);
	    int question;

		switch(type)
		{
			case ADDITION:
				question = addition(number1, number2);
				break;
			case SUBTRACTION:
				question = subtraction(number1, number2);
				break;
			case MULTIPLICATION:
				question = multiplication(number1, number2);
				break;
			case DIVISION:
				question = division(number1, number2);
				break;
			case MIXED:
				question = mixed(number1, number2);
				break;
			default:
				System.out.println("Wrong choice. Picking mixed problems as default");
				question = mixed(number1, number2);
				break;
		}
		
		return question;

	}

	public static int addition(int number1, int number2)
	{
		System.out.printf("How much is %d plus %d?%n", number1, number2);
		return number1 + number2;
	}

	public static int subtraction(int number1, int number2)
	{
		System.out.printf("How much is %d minus %d?%n", number1, number2);
		return number1 - number2;
	}

	public static int multiplication(int number1, int number2)
	{
		System.out.printf("How much is %d times %d?%n", number1, number2);
		return number1 * number2;
	}

	public static int division(int number1, int number2)
	{
		System.out.printf("How much is %d over %d?%n", number1, number2);
		while (number2 == 0)
			number2 = random.nextInt(level);
		return number1 / number2;
	}

	public static int mixed(int number1, int number2)
	{
		int randomPick = random.nextInt(4);
		int question;
		switch (randomPick)
		{
			case 0:
				question = addition(number1, number2);
				break;
			case 1:
				question = subtraction(number1, number2);
				break;
			case 3:
				question = multiplication(number1, number2);
				break;
			case 4:
				question = division(number1, number2);
				break;
			default:
				question = addition(number1, number2);
				break;
		}

		return question;
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
