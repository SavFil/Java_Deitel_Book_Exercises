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
	public static void main(String[] args){

		loadProgramInMemory(PROGRAM_E);
		for (int index = 0; index < memory.length; index++)
		{
			int instruction = memory[index] / 100;
			int location = memory[index] % 100;


			switch (instruction)
			{
				case READ:
					int input = keyboard.nextInt();
					memory[location] = input;
					break;
				case WRITE:
					System.out.printf("%d%n", memory[location]);
					break;
				case LOAD:
					accumulator = memory[location];
					break;
				case STORE:
					memory[location] = accumulator;
					break;
				case ADD:
					accumulator += memory[location];
					break;
				case SUBTRACT:
					accumulator -= memory[location];
					break;
				case DIVIDE:
					accumulator /= memory[location];
					break;
				case MULTIPLY:
					accumulator *= memory[location];
					break;
				case BRANCH:
					index = location - 1;
					break;
				case BRANCHNEG:
					if (accumulator < 0)
						index = location - 1;
					break;
				case BRANCHZERO:
					if (accumulator == 0)
						index = location - 1;
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
