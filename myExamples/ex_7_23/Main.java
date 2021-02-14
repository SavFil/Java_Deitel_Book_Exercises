import java.util.ArrayList;
import java.util.Random;

public class Main{

	private static final int ROWS = 8;
	private static final int COLUMNS = 8;
	private static final int SQUARES = 64;
	
	private static final int[] horizontal = {2, 1, -1, -2, -2, -1, 1, 2};
	private static final int[]   vertical = {-1, -2, -2, -1, 1, 2, 2, 1};
	private static final int MOVE_TYPES = 8;
	private static final int NOT_FOUND = -1;
	private static final int TYPE_0 = 0;
	private static final int TYPE_1 = 1;
	private static final int TYPE_2 = 2;
	private static final int TYPE_3 = 3;
	private static final int TYPE_4 = 4;
	private static final int TYPE_5 = 5;
	private static final int TYPE_6 = 6;
	private static final int TYPE_7 = 7;

	private static final int[][] PROTOTYPE = {{2, 3, 4, 4, 4, 4, 3, 2},
											   {3, 4, 6, 6, 6, 6, 4, 3},
											   {4, 6, 8, 8, 8, 8, 4, 3},
											   {4, 6, 8, 8, 8, 8, 4, 3},
											   {4, 6, 8, 8, 8, 8, 4, 3},
											   {4, 6, 8, 8, 8, 8, 4, 3},
											   {3, 4, 6, 6, 6, 6, 4, 3},
											   {2, 3, 4, 4, 4, 4, 3, 2}};
	private static int[][] HEURISTIC = new int[ROWS][COLUMNS];

	private static class Chessboard
	{
		private int[][] board;
		private int currentRow;
		private int currentColumn;

		public Chessboard(int row, int col)
		{
			board = new int[ROWS][COLUMNS];
			currentRow = row;
			currentColumn = col;
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

	private static Chessboard chessboard;
	private static Random random = new Random();

	public static void main(String[] args)
	{
		int[] tours = new int[65];
		for (int counter = 0; counter < 1000; counter++)	
		{
			for (int rowIndex = 0; rowIndex < ROWS; rowIndex++)
			{
				for (int colIndex = 0; colIndex < COLUMNS; colIndex++)
				{		
					//System.out.printf("Starting row: %d, col: %d%n", rowIndex, colIndex);
					//printLine();
					chessboard = new Chessboard(rowIndex, colIndex);
					tours[fullTour()]++;
					//printArray2D(chessboard.getBoard());
					//printArray2D(HEURISTIC);
					//printLine();
				}
			}
		}
		printArray(tours);

	}

	public static void printLine()
	{
		System.out.printf("%n****************************************%n");
	}

	public static int fullTour()
	{	
		ArrayList<Integer> candidates = new ArrayList<Integer>();
		resetHeuristic();
	    int step = 1;
		int totalSteps = 0;

		do
		{
			candidates.clear();

			for (int type = TYPE_0; type < MOVE_TYPES; type++)
			{
				int nextRow = getNextRow(type);
				int nextColumn = getNextColumn(type);
				
				if (isInbounds(nextRow, nextColumn))
				{
					updateHeuristic(nextRow, nextColumn);
					if	(isFirstVisit(nextRow, nextColumn))
					{
						candidates.add(type);
					}
				}
			}

			if (candidates.size() > 0)
			{
			    int	bestType = randomType(candidates);
			    //int	bestType = leastAccessible(candidates);
				totalSteps = step;
				chessboard.simpleStep(vertical[bestType], horizontal[bestType], step);
				step++;
			}
				
		}while (candidates.size() > 0);

		return totalSteps;
	}

	public static int getNextRow(int type)
	{
		return chessboard.getCurrentRow() + vertical[type];
	}

	public static int getNextColumn(int type)
	{
		return chessboard.getCurrentColumn() + horizontal[type];
	}

	public static int getSecondNextRow(int firstType, int secondType)
	{
		return chessboard.getCurrentRow() + vertical[firstType] + vertical[secondType];
	}

	public static int getSecondNextColumn(int firstType, int secondType)
	{
		return chessboard.getCurrentColumn() + horizontal[firstType] + horizontal[secondType];
	}
	public static void updateHeuristic(int row, int col)
	{
	    HEURISTIC[row][col] -= HEURISTIC[row][col] > 0 ? 1 : 0;	
	}

	public static void resetHeuristic()
	{
		for (int row = 0; row < ROWS; row++)
		{
			System.arraycopy(PROTOTYPE[row], 0, HEURISTIC[row], 0, COLUMNS); 
		}
	}
	
	public static int randomType(ArrayList<Integer> candidates)
	{
		return candidates.get(random.nextInt(candidates.size()));
	}

	public static int leastAccessible(ArrayList<Integer> candidates)
	{
		int min = 999;
		int type = -1;
		ArrayList<Integer> secondPass = new ArrayList<Integer>();

		for (int candidate : candidates)
		{
			int nextRow = getNextRow(candidate);
			int nextColumn = getNextColumn(candidate);
			int heuristic = HEURISTIC[nextRow][nextColumn]; 
			
			if (heuristic < min)
			{
				min = heuristic;
				type = candidate;
			}
		}
/*
		for (int candidate : candidates)
		{
			int nextRow = getNextRow(candidate);
			int nextColumn = getNextColumn(candidate);
			int heuristic = HEURISTIC[nextRow][nextColumn]; 
			
			if (heuristic == min)
			{
				secondPass.add(candidate);
			}
		}

		if (secondPass.size() > 0 )
		{
		 	min = 999;	
			for (int candidate : secondPass)
			{
				for (int nextType = TYPE_0; nextType < MOVE_TYPES; nextType++)
				{
					int nextRow = getSecondNextRow(candidate, nextType);
					int nextColumn = getSecondNextColumn(candidate, nextType);
					
					if (isInbounds(nextRow, nextColumn) &&
							isFirstVisit(nextRow, nextColumn)) 
					{
						int heuristic = HEURISTIC[nextRow][nextColumn]; 
						
						if (heuristic < min)
						{
							min = heuristic;
							type = candidate;
						}
					}
				}
			}
		}
*/

		
		return type;
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

	public static void printArray(int[] array)
	{
		for (int tour = 1; tour <= SQUARES; tour++)
		{
			System.out.printf("%n%d Tours ended on the #%d move", array[tour], tour);
		}

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
		System.out.println();
	}


}
