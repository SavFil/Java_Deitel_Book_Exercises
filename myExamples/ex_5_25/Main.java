import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input an odd number between 1-19");
		int num = input.nextInt();
		int mid = num / 2;
		int stars = 1;
		int offset = num - 2;

		for (int spaces = mid; spaces >= 0; spaces--)
		{
				for (int i = 1; i <= spaces; i++)
					System.out.print(" ");
				for (int i = 1; i <= stars; i++)
					System.out.print("*");
				System.out.println();
				stars += 2;
		}
		stars = offset;
		for (int spaces = 1; spaces <= mid; spaces++)
		{
				for (int i = 1; i <= spaces; i++)
					System.out.print(" ");
				for (int i = 1; i <= stars; i++)
					System.out.print("*");
				System.out.println();
				stars -= 2;
		}
	}


}
