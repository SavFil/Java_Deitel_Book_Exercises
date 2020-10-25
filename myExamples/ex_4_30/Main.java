import java.util.Scanner;
public class Main{


	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.printf("Input square side length%n");
		int squareSide = input.nextInt();
		int emptySpace = squareSide - 2;
		
		StringBuilder percentString = new StringBuilder(); 	
		percentString.append("%").append(squareSide).append("s%n");
		String horizontal = String.format(percentString.toString(), " ")
			.replace(' ', '*');
		System.out.print(horizontal);
		

		percentString.setLength(0);
		percentString.append("*%").append(emptySpace).append("s*%n");
		String vertical = String.format(percentString.toString(), " ");
		for (int counter = 1; counter <= emptySpace; counter++)
			System.out.print(vertical);
		
		System.out.print(horizontal);



	}

}
