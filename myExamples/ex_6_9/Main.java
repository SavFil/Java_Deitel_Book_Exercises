import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double y = Math.floor(x + 0.5);
		
		System.out.printf("x: %.2f, y: %.2f",x, y);

	}

}
