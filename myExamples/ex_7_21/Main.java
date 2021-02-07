public class Main{

	private static final int PEN_UP = 1;
	private static final int PEN_DOWN = 2;
	private static final int TURN_RIGHT = 3;
	private static final int TURN_LEFT = 4;
	private static final int MOVE_FORWARD = 5;
	private static final int DISPLAY = 6;
	private static final int SENTINEL = 9;
	
	private static final int ASTERISK = 1;
	private static final int SPACE = 0;

	private static final int ROWS = 20;
	private static final int COLUMNS = 20;
	
	private static enum PenState {UP, DOWN};
	
	private static final int[][] DIRECTIONS = {{1, 0, -1, 0},
										   {0, 1, 0, -1}};
	private static final int RIGHT = 0;
	private static final int DOWN = 1;
	private static final int LEFT = 2;
	private static final int UP = 3;

	public static void main(String[] args)
	{
		int direction = RIGHT;
		int xPos = 0;
		int yPos = 0;
		PenState penState = PenState.UP;

		int[][] floor = new int[ROWS][COLUMNS];
		int[][] commands = {{PEN_DOWN}, 
							{MOVE_FORWARD, 12},
							{TURN_RIGHT},
							{MOVE_FORWARD, 12},
							{TURN_RIGHT},
							{MOVE_FORWARD, 12},
							{TURN_RIGHT},
							{MOVE_FORWARD, 12},
							{PEN_UP},
							{DISPLAY},
							{SENTINEL}};

		
		for (int[] command : commands)
		{
			switch (command[0])
			{
				case PEN_UP:
					penState = PenState.UP;
					break;
				case PEN_DOWN:
					penState = PenState.DOWN;
					break;
				case TURN_RIGHT:
					direction = ++direction % 4;
					break;
				case TURN_LEFT:
					direction = --direction % 4;
					break;
				case MOVE_FORWARD:
					for (int step = 0; step < command[1]; step++)
					{
						xPos += DIRECTIONS[0][direction];
						yPos += DIRECTIONS[1][direction];
						if (penState == PenState.DOWN)
						{
							floor[xPos][yPos] = ASTERISK;
						}
					}
					break;
				case DISPLAY:
					for (int[] row : floor)
					{
						for (int col : row)
						{
							if (col == ASTERISK)
							{
								System.out.print("*");
							}
							else if (col == SPACE)
							{
								System.out.print(" ");
							}
						}
						System.out.println();
					}
					break;
				case SENTINEL:
					break;
				default:
					break;
			}
		}
	}
}
