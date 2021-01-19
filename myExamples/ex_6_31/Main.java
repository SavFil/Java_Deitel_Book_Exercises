import java.util.Scanner;
import java.util.Random;

public class Main{


	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int guess;
		int count = 0;			

		int	game = 1 + random.nextInt(1000);
		System.out.println("Guess the number between 1 - 1000.");
		do
		{
			guess = input.nextInt();
		    count++;	
			if (guess != -1){
		    if (guess < game)
				System.out.println("Too low");
			else if (guess > game)
				System.out.println("Too high");
			else{
				System.out.println("Congratulations");
			    display(count);	
				System.out.println("Guess the number between 1 - 1000.");
				game = 1 + random.nextInt(1000);
				count = 0;
			}
			}

		}
		while (guess != -1);
	}
	
	public static void display(int count)
	{

		if (count < 10)
			System.out.println("Either you know the secret or you got lucky!");
		else if (count == 10)
			System.out.println("Aha! You know the secret!");
		else
			System.out.println("You should be able to do better!");
	}

}
