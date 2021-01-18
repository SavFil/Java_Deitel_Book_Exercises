import java.util.Scanner;
import java.util.Random;

public class Main{


	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int guess;
			

		int	game = 1 + random.nextInt(1000);
		System.out.println("Guess the number between 1 - 1000.");
		do
		{
			guess = input.nextInt();
			
			if (guess != -1){
		    if (guess < game)
				System.out.println("Too low");
			else if (guess > game)
				System.out.println("Too high");
			else{
				System.out.println("Congratulations");

				System.out.println("Guess the number between 1 - 1000.");
				game = 1 + random.nextInt(1000);
			}
			}

		}
		while (guess != -1);
	}

}
