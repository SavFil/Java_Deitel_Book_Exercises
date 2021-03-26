import java.util.Scanner;

public class Menu{

	private static final String intro = String.format("*** %-21s ***%n*** %-45s ***%n*** %-45s ***%n*** %-45s ***%n*** %-45s ***%n*** %-45s ***%n%n", "Welcome to Simpletron!", "Please enter your program one instruction", "(or data word) at a time. I will display", "the location number and a question mark (?).", "you then type the word for that location.", "Type -99999 to stop entering your program.");


	public Menu()
	{
		Scanner input = new Scanner(System.in);
		int command;
		System.out.print(intro);

		do{
			System.out.printf("%01d ? %04d%n", Simpletron.getMemoryIndex(), Simpletron.getDataAtIndex());
			command = input.nextInt();
			Simpletron.setMemory(command);
		} while (command != -99999);


	}
}
