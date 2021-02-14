public class Main{

	private static final int ROWS = 16;
	private static final int COLUMNS = 16;

	private static final int MOVES = 8;
	private static final int[] HORIZONTAL = {1, 1, 0, -1, -1, -1, 0, 1};
	private static final int[] VERTICAL   = {0, -1, -1, -1, 0, 1, 1, 1};
	public static void main(String[] args)
	{
		int[][] heuristic = new int[ROWS][COLUMNS];

		for (int rowIndex = 0; rowIndex < ROWS; rowIndex++)
		{
			for (int colIndex = 0; colIndex < COLUMNS; colIndex++)
			{
				int nextRow = rowIndex;
				int nextColumn = colIndex; 
				int move = 0;
				while (move < MOVES)
				{
					while (isInBounds(nextRow, nextColumn))
					{
						nextRow += VERTICAL[move];
						nextColumn += HORIZONTAL[move]; 
						heuristic[rowIndex][colIndex]++;
					}
					if (++move < MOVES)
					{
						nextRow = rowIndex + VERTICAL[move];
						nextColumn = colIndex + HORIZONTAL[move]; 
					}
				}
			}
		}

		print2DArray(heuristic);
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
