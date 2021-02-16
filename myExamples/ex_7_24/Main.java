import java.util.Random;

public class Main{

	private static final int ROWS = 8;
	private static final int COLUMNS = 8;

	private static final int MOVES = 8;
	private static final int[] HORIZONTAL = {1, 1, 0, -1, -1, -1, 0, 1};
	private static final int[] VERTICAL   = {0, -1, -1, -1, 0, 1, 1, 1};

	private static int queens = 1;
	private static final Random random = new Random();

	public static void main(String[] args)
	{
		int[][] heuristic = new int[ROWS][COLUMNS];
		int[][] board = new int[ROWS][COLUMNS];	
		generateHeuristic(board,heuristic);
		print2DArray(heuristic);

		for (int rowIndex = 0; rowIndex < 1; rowIndex++)
		{
			for (int colIndex = 0; colIndex < COLUMNS; colIndex++)
			{
					placeQueen(board, heuristic, rowIndex, colIndex);
			}
		}
		print2DArray(board);
		print2DArray(heuristic);
	}

	public static void placeQueen(int[][] board,int[][] heuristic, int row, int col)
	{
		int nextRow;
		int nextColumn;

		if (board[row][col] == 0)
		{	
			for (int move = 0; move < MOVES; move++) 
			{
				nextRow = row;
				nextColumn = col;
				while (isInBounds(nextRow, nextColumn))
				{
					board[nextRow][nextColumn] = queens;
					nextRow += VERTICAL[move];
					nextColumn += HORIZONTAL[move]; 
				}
			}
			++queens;
		}
		generateHeuristic(board, heuristic);
	}

	public static void generateHeuristic(int[][] board, int[][] heuristic)
	{
		int[][] tmp = new int[ROWS][COLUMNS];

		for (int rowIndex = 0; rowIndex < ROWS; rowIndex++)
		{
			for (int colIndex = 0; colIndex < COLUMNS; colIndex++)
			{
				if (board[rowIndex][colIndex] == 0)
				{
					int nextRow = rowIndex;
					int nextColumn = colIndex; 
					int move = 0;
					while (move < MOVES)
					{
						while (isInBounds(nextRow, nextColumn))
						{
							if (board[nextRow][nextColumn] == 0)
							{
								tmp[rowIndex][colIndex]++;
							}
							else
							{
								break;
							}
							nextRow += VERTICAL[move];
							nextColumn += HORIZONTAL[move]; 
						}
						if (++move < MOVES)
						{
							nextRow = rowIndex + VERTICAL[move];
							nextColumn = colIndex + HORIZONTAL[move]; 
						}
					}
				}
				else
				{
					tmp[rowIndex][colIndex] = -1;
				}
			}
		}

		for (int row = 0; row < ROWS; row++)
		{
			System.arraycopy(tmp[row], 0, heuristic[row], 0, COLUMNS);
		}

	}
	public static boolean isInBounds(int row, int col)
	{
		return row >= 0 && row < ROWS &&
			col >= 0 && col < COLUMNS;
	}

	public static void print2DArray(int[][] array)
	{
		for (int[] row : array)
		{
			for (int col : row)
			{
				System.out.printf("%-3d", col);
			}
			System.out.println();
		}
		System.out.println();
	}


}