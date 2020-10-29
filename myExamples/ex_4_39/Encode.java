import java.util.Scanner;

public class Encode{

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int number = input.nextInt();

		input.close();

		int firstDigit = number / 1000;
		int secondDigit = number % 1000 / 100;
		int thirdDigit = number % 100 / 10;
		int fourthDigit = number % 10;

		System.out.printf("%d%d%d%d%n", (thirdDigit + 7) % 10,
				(fourthDigit + 7) % 10,
				(firstDigit + 7) % 10,
				(secondDigit + 7) % 10);
	}
}
