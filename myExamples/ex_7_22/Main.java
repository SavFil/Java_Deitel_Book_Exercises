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

	private static final int[][] HEURISTIC = {{2, 3, 4, 4, 4, 4, 3, 2},
											  {3, 4, 6, 6, 6, 6, 4, 3},
											  {4, 6, 8, 8, 8, 8, 4, 3},
											  {4, 6, 8, 8, 8, 8, 4, 3},
											  {4, 6, 8, 8, 8, 8, 4, 3},
											  {4, 6, 8, 8, 8, 8, 4, 3},
											  {3, 4, 6, 6, 6, 6, 4, 3},
											  {2, 3, 4, 4, 4, 4, 3, 2}};

	private static class Chessboard
	{
		private int[][] board;
		private int currentRow;
		private int currentColumn;

		public Chessboard()
		{
			board = new int[ROWS][COLUMNS];
			currentRow = 0;
			currentColumn = 0;
		}

		public int[][] getBoard()
		{
			return board;
		}

		public int getSquare(int row, int col)
		{
			return board[row][col];
		}

		public void setCurrentSquare(int value)
		{
			board[currentRow][currentColumn] = value;
		}

		public int getCurrentSquare()
		{
			return board[currentRow][currentColumn];
		}

		public void setCurrentRow(int row)
		{
			currentRow += row;
		}

		public int getCurrentRow()
		{
			return currentRow;
		}

		public void setCurrentColumn(int col)
		{
			currentColumn += col;
		}

		public int getCurrentColumn()
		{
			return currentColumn;
		}

		public void simpleStep(int verticalStep, int horizontalStep, int stepNumber)
		{
			setCurrentRow(verticalStep);
			setCurrentColumn(horizontalStep);
			setCurrentSquare(stepNumber);
		}
	}

	private static Chessboard chessboard = new Chessboard();
	

	public static void main(String[] args)
	{

		
		for (int step = 1; step <= SQUARES; step++)
		{
			for (int type = TYPE_0; type < MOVE_TYPES; type++)
			{
				int nextRow = chessboard.getCurrentRow() + vertical[type];
				int nextColumn = chessboard.getCurrentColumn() + horizontal[type];
								
				if (isInbounds(nextRow, nextColumn) &&
							isFirstVisit(nextRow, nextColumn))
				{
					chessboard.simpleStep(vertical[type], horizontal[type], step);
					break;
				}
			}
		}
		

		printArray2D(chessboard.getBoard());
	}

	public static boolean isInbounds(int row, int col)
	{

		boolean inbounds = true;

		inbounds = (row < 0 || row >= ROWS || 
				col < 0 || col >= COLUMNS) ? false : true;

		return inbounds;
		
	}

	public static boolean isFirstVisit(int row, int col)
	{
		boolean firstVisit = true;

		firstVisit = (chessboard.getSquare(row, col) == 0) ? true : false;

		return firstVisit;
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
