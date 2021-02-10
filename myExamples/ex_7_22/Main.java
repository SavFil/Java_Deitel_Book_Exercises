public class Main{

	private static final int ROWS = 8;
	private static final int COLUMNS = 8;
	private static final int SQUARES = 64;
	
	
	private static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
	private static final int[]   vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
	private static final int MOVE_TYPES = 8;
	private static final int TYPE_0 = 0;
	private static final int TYPE_1 = 1;
	private static final int TYPE_2 = 2;
	private static final int TYPE_3 = 3;
	private static final int TYPE_4 = 4;
	private static final int TYPE_5 = 5;
	private static final int TYPE_6 = 6;
	private static final int TYPE_7 = 7;

	public static void main(String[] args)
	{
		int[][] board = new int[ROWS][COLUMNS];
		
		int currentRow = 0;
		int currentColumn = 0;
		

		for (int step = 1; step <= SQUARES; step++)
		{
			for (int type = TYPE_0; type < MOVE_TYPES; type++)
			{
				if (isInbounds(currentRow, currentColumn, type) &&
							isFirstVisit(board, currentRow, currentColumn, type))
				{
					currentRow += vertical[type];
					currentColumn += horizontal[type];
					board[currentRow][currentColumn] = step;
					break;
				}
			}
		}

		printArray2D(board);
	}

	public static boolean isInbounds(int row, int col, int type)
	{
		int nextRow = getNextRow(row, type);
		int nextCol = getNextColumn(col, type);

		boolean inbounds = true;

		inbounds = (nextRow < 0 || nextRow >= ROWS || 
				nextCol < 0 || nextCol >= COLUMNS) ? false : true;

		return inbounds;
		
	}

	public static boolean isFirstVisit(int[][] board, int row, int col, int type)
	{
		int nextRow = getNextRow(row, type);
		int nextCol = getNextColumn(col, type);
		boolean firstVisit = true;

		firstVisit = (board[nextRow][nextCol] == 0) ? true : false;

		return firstVisit;
	}

	public static int getNextRow(int row, int type)
	{
		return row + vertical[type];
	}

	public static int getNextColumn(int col, int type)
	{
		return col + horizontal[type];
	}

	public static void printArray2D(int[][] array)
	{
		for (int row[] : array)
		{
			for (int col : row)
			{
				System.out.printf("%-3d", col);
			}
			System.out.println();
		}
	}
}
