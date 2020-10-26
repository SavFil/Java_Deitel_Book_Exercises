import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		int binNumber = input.nextInt();
		int tempNumber = binNumber;
		int digitCount = 1;
		int decimal = 0;
		int powOfTwo = 2;
		
		input.close();

		while ( (tempNumber /= 10) > 0)
			digitCount++;
		
		for (int i = 0; i < digitCount; i++)
		{

			if (i == 0)
				powOfTwo = 1;
			else if (i == 1)
				powOfTwo = 2;
			else
				powOfTwo *= 2;

			if (binNumber % 10 == 1)
				decimal += powOfTwo;
			
			binNumber *= 0.1;
			
		}
		
		System.out.println(decimal);


	}

}
