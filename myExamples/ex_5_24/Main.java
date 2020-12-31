public class Main{

	public static void main(String[] args)
	{
		int stars = 1;
		for (int spaces = 4; spaces >= 0; spaces--)
		{
				for (int i = 1; i <= spaces; i++)
					System.out.print(" ");
				for (int i = 1; i <= stars; i++)
					System.out.print("*");
				System.out.println();
				stars += 2;
		}
		stars = 7;
		for (int spaces = 1; spaces <= 4; spaces++)
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
