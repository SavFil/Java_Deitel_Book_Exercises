import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);

		int sideA = input.nextInt();
		int sideB = input.nextInt();
		int sideC = input.nextInt();

		input.close();

		System.out.printf("%s", sideA * sideA == sideB * sideB + sideC * sideC ||
				sideB * sideB == sideC * sideC + sideA * sideA ||
				sideC * sideC == sideA * sideA + sideB * sideB ? 
				"Sides could represent a right triangle" :
				"Sides could not represent a right triangle");
	}

}
