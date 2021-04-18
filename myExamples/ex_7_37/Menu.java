import java.util.Scanner;

public class Menu{

	private static final int SENTINEL = -99999;
	private static final String intro = String.format("*** %-21s ***%n*** %-45s ***%n*** %-45s ***%n*** %-45s ***%n*** %-45s ***%n*** %-45s ***%n%n", "Welcome to Simpletron!", "Please enter your program one instruction", "(or data word) at a time. I will display", "the location number and a question mark (?).", "you then type the word for that location.", "Type -99999 to stop entering your program.");


	public Menu()
	{
		Scanner input = new Scanner(System.in);
		Simpletron mySimpletron = new Simpletron();
		int command;
		System.out.print(intro);

		do{
			System.out.printf("%01d ? %04d%n", mySimpletron.getMemoryIndex(), mySimpletron.getDataAtIndex());
			command = input.nextInt();
			if (command != SENTINEL)
				mySimpletron.setMemory(command);
		} while (command != SENTINEL);

		if (command == SENTINEL)
		{
			System.out.printf("*** %-45s ***%n*** %-45s ***%n", "Program loading completed", "Program execution begins.");
			mySimpletron.runProgram();

			System.out.printf("%n%n%8s%s%n%-21s+%04d%n%-24s%02d%n%-21s+%04d%n%-24s%02d%n%-24s%02d", "", "REGISTERS:", "accumulator", mySimpletron.getAccumulator(), "instructionCounter", mySimpletron.getMemoryIndex(), "instructionRegister", mySimpletron.getInstructionRegister(), "operationCode", mySimpletron.getOperationCode(), "operand", mySimpletron.getOperand());
			mySimpletron.printMemory();
		}


	}

}
