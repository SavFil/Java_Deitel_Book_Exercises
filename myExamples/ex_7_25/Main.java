import java.util.Random;

public class Main{

	private static final int ROWS = 8;
	private static final int COLUMNS = 8;

	private static final int QUEENS = 8;
	private static int QUEEN = 0;
	private static int tries = 0;

	private static final int MOVES = 8;
	private static final int[] HORIZONTAL = {1, 1, 0, -1, -1, -1, 0, 1};
	private static final int[] VERTICAL   = {0, -1, -1, -1, 0, 1, 1, 1};
	private static final Random random = new Random();

	public static void main(String[] args)
	{
		int[][] board;

		do
		{
			tries++;
			QUEEN = 0;
			board = new int[ROWS][COLUMNS];
			for (int queen = 0; queen <= QUEENS; queen++)
			{
				placeQueen(board, pickRandomPosition());
			}

		}while (QUEEN < 8);

		printArray2D(board);
		System.out.printf("Tries: %d", tries);
	}

	public static void placeQueen(int[][] board, int[] position)
	{
		int row = position[0];
		int column = position[1];

		if (board[row][column] == 0)
		{
			QUEEN++;
			board[row][column] = QUEEN;

			for (int move = 0; move < MOVES; move++)
			{
				int nextRow = row + VERTICAL[move];
				int nextColumn = column + HORIZONTAL[move];

				while (isInbounds(nextRow, nextColumn))
				{
					board[nextRow][nextColumn] = QUEEN;
					nextRow += VERTICAL[move];
					nextColumn += HORIZONTAL[move];
				}
			}
		}
	}

	private static boolean isInbounds(int row, int column)
	{
		return row >= 0 && row < ROWS &&
			column >= 0 && column < COLUMNS;
	}

	public static int[] pickRandomPosition()
	{
		return new int[]{random.nextInt(ROWS), random.nextInt(COLUMNS)};
	}

	public static void printArray(int[] array)
	{
		for (int column : array)
		{
			System.out.printf("%-3d", column);
		}
		System.out.println();
	}

	public static void printArray2D(int[][] array)
	{
		for (int[] row : array)
		{
			for (int column : row)
			{
				System.out.printf("%-3d", column);
			}
			System.out.println();
		}
		System.out.println();
	}

}
