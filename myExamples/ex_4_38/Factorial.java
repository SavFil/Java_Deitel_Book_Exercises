import java.util.Scanner;

public class Factorial{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		int number = input.nextInt();
		int factorial = number;

		while(number >= 2)
			factorial *= --number;

		System.out.println(factorial);
	}
	

}
