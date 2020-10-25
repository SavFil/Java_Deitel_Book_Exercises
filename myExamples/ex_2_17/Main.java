import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input 3 integers");

		int first = input.nextInt();
		int second = input.nextInt();
		int third = input.nextInt();

		input.close();
		
		System.out.printf("%n%-12s%d%n%-12s%d%n%-12s%d%n%-12s%d%n%-12s%d",
				"sum: ", first + second + third,
				"average: ", (first + second + third) / 3,
				"product: ", first * second * third,
				"min: ", Math.min(Math.min(first, second), third),
				"max: ", Math.max(Math.max(first,second), third));
	}
}
