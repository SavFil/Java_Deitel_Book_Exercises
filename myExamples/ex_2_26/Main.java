import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.println("Input two integers");

		int first = input.nextInt();
		int second = input.nextInt();

		input.close();

		System.out.printf("%n%s", first % second == 0 ? "multiple" : "not multiple");
	}
}
