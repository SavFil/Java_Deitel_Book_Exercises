import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);


		int average = input.nextInt();

		System.out.print(qualityPoints(average));
	}


	public static int qualityPoints(int average)
	{

		if (average < 60)
		{
			return 0;
		}
		else if (average < 70)
		{
			return 1;
		}
		else if (average < 80)
		{
			return 2;
		}
		else if (average < 90)
		{
			return 3;
		}
		else
			return 4;
	}

}
