import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int sideA = input.nextInt();
		int sideB = input.nextInt();
		int sideC = input.nextInt();

		input.close();

		System.out.printf("%s", sideA + sideB > sideC &&
				sideB + sideC > sideA &&
				sideC + sideA > sideB ? "Sides of a triangle" : "Not sides of a triangle");
	}

}
