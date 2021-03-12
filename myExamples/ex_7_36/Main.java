import java.util.Scanner;

public class Main{

	private static final Scanner keyboard = new Scanner(System.in);

	private static final int READ       = 10;
	private static final int WRITE      = 11;
	private static final int LOAD       = 20;
	private static final int STORE      = 21;
	private static final int ADD        = 30;
	private static final int SUBTRACT   = 31;
	private static final int DIVIDE     = 32;
	private static final int MULTIPLY   = 33;
	private static final int BRANCH     = 40;
	private static final int BRANCHNEG  = 41;
	private static final int BRANCHZERO = 42;
	private static final int HALT       = 43;

	private static final int[] memory = new int[100];
	private static int accumulator;

	private static final int[] PROGRAM_A = {1007,
											1008,
											2007,
											3008,
											2109,
											1109,
											4300,
											0000,
											0000,
											0000};

	public static void main(String[] args){

		loadProgramInMemory(PROGRAM_A);

		for (int index = 0; index < memory.length; index++)
		{
			int instruction = memory[index] / 100;
			int location = memory[index] % 100;


			switch (instruction)
			{
				case READ:
					int input = keyboard.nextInt();
					memory[input % 100] = input / 100;
					break;
				case WRITE:
					System.out.printf("%d%n", memory[location]);
					break;
			}

			if (instruction == HALT)
			{
				break;
			}
		}
	}

	public static void loadProgramInMemory(int[] program){
		System.arraycopy(program, 0, memory, 0, program.length);
	}
}
