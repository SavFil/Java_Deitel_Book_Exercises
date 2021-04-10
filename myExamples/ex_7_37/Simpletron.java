import java.util.Scanner;

public class Simpletron{

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

	private static final int memorySize = 100;
	private static final int[] memory = new int[memorySize];
	private static int instructionCounter = 0;
	private static int accumulator;
	private static int instructionRegister = 0;

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

	private static final int[] PROGRAM_B = {1009,
											1010,
											2009,
											3110,
											4107,
											1109,
											4300,
											1110,
											4300,
											0000,
											0000,
											0000};

	private static final int[] PROGRAM_C = {2009,
											3010,
											2109,
											1010,
											2010,
											4207,
											4000,
											1109,
											4300,
											0000,
											0000};

	private static final int[] PROGRAM_D = {0006,
											0001,
											2017,
											1016,
											3016,
											2117,
											2000,
											4211,
											3101,
											2100,
											4002,
											2017,
											3218,
											2117,
											1117,
											4300,
											0000,
											0000,
											0007};

	private static final int[] PROGRAM_E = {0001,
											1080,
											1082,
											2081,
											3182,
											4107,
											4009,
											2082,
											2181,
											2080,
											3100,
											4214,
											2180,
											4002,
											1181,
											4300,
											2002,
											3100,
											2102,
											4222,
											2028,
											4027,
											1128,
											4300,
											0000,
											0000,
											0005,
											0000,
											0000,

											};
	public void runProgram(){

		//loadProgramInMemory(PROGRAM_E);
		for (int index = 0; index < memory.length; index++)
		{
			instructionRegister = memory[index];
			int operationCode = instructionRegister / 100;
			int operand = instructionRegister % 100;


			switch (operationCode)
			{
				case READ:
					int input = keyboard.nextInt();
					memory[operand] = input;
					break;
				case WRITE:
					System.out.printf("%d%n", memory[operand]);
					break;
				case LOAD:
					accumulator = memory[operand];
					break;
				case STORE:
					memory[operand] = accumulator;
					break;
				case ADD:
					accumulator += memory[operand];
					break;
				case SUBTRACT:
					accumulator -= memory[operand];
					break;
				case DIVIDE:
					accumulator /= memory[operand];
					break;
				case MULTIPLY:
					accumulator *= memory[operand];
					break;
				case BRANCH:
					index = operand - 1;
					break;
				case BRANCHNEG:
					if (accumulator < 0)
						index = operand - 1;
					break;
				case BRANCHZERO:
					if (accumulator == 0)
						index = operand - 1;
					break;
			}

			if (operationCode == HALT)
			{
				System.out.println("*** Simpletron execution terminated ***");
				break;
			}
		}
	}

	public static void loadProgramInMemory(int[] program){
		System.arraycopy(program, 0, memory, 0, program.length);
	}

	public void setMemory(int data)
	{
		if (instructionCounter < memorySize)
		{
			memory[instructionCounter++] = data;
		}
	}

	public int getMemoryIndex()
	{
		return instructionCounter;
	}

	public int getDataAtIndex()
	{
		return memory[instructionCounter];
	}

}
