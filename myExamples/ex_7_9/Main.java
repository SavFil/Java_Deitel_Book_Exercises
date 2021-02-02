import java.util.Scanner;
public class Main{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int[][] t = new int[2][3];
		
		// t[1][0], t[1][1], t[1][2]
		// t[0][2], t[1][2]
		
		t[0][1] = 0;

		t[0][0] = 0;
		t[0][1] = 0;
		t[0][2] = 0;
		t[1][0] = 0;
		t[1][1] = 0;
		t[1][2] = 0;

		for (int row = 0; row < t.length; row++)
		{
			for (int col = 0; col < t[row].length; col++)
			{
				t[row][col] = 0;
			}
		}

		for (int row = 0; row < t.length; row++)
		{
			for (int col = 0; col < t[row].length; col++)
			{
				t[row][col] = input.nextInt();		
			}
		}

		for (int row = 0; row < t.length; row++)
		{
			for (int col = 0; col < t[row].length; col++)
			{
				System.out.printf("%-2d", t[row][col]);		
			}
			System.out.println();
		}

		int min = t[0][0];
		
		for (int row = 0; row < t.length; row++)
		{
			for (int col = 0; col < t[row].length; col++)
			{
				if (t[row][col] < min)
					min = t[row][col];
			}
		}
		System.out.println(min);

		System.out.printf("%-2d%-2d%-2d", t[0][0], t[0][1], t[0][2]);
		System.out.println();

		int sum = t[0][2] + t[1][2];

		System.out.printf("    %2d%2d%2d%n%n", 0, 1, 2);
		for (int row = 0; row < t.length; row++)
		{
			System.out.printf("%-4d",row);
			for (int col = 0; col < t[row].length; col++)
			{
				System.out.printf("%2d", t[row][col]);		
			}
			System.out.println();
		}
		
	}

}
