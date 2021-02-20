import java.util.Random;
import java.util.ArrayList;

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
		System.out.println("Without Look Forward");
		int TURN = Integer.parseInt(args[0]);
		int[][] heuristic = new int[ROWS][COLUMNS];
		int[][] board = new int[ROWS][COLUMNS];	
		generateHeuristic(board,heuristic);
		//print2DArray(board);
		//print2DArray(heuristic);
		int position[] = new int[2];
		
		for (int i = 0 ; i < ROWS; i++)
			for (int j = 0; j < COLUMNS; j++)
		{
				queens = 1;
				heuristic = new int[ROWS][COLUMNS];
				board = new int[ROWS][COLUMNS];	
				generateHeuristic(board,heuristic);
				position[0] = i; 
				position[1] = j; 
				System.out.println(position[0] + " " + position[1]);
				placeQueen(board, heuristic, position[0], position[1]);

				for (int turn = 1; turn < TURN; turn++)
				{
					position = pickMinPosition(heuristic);
					System.out.println(position[0] + " " + position[1]);
					placeQueen(board, heuristic, position[0], position[1]);
				}
				print2DArray(board);
				print2DArray(heuristic);
				if (queens == 9) System.out.println("8queens");
		}
		/*
		 * 1) try looking behind the wall -done
		 * 2) try starting from all positions, for both algorithms -done
		 * 3) try with random candidates, starting from all positions, for both algorithms done
		 * 4) refactor code and be done with it
		 * */
	}

	public static int[] pickMinPosition(int[][] heuristic)
	{
		int[] minPosition = new int[2];
		int min = 99;
		ArrayList<int[]> candidates = new ArrayList<int[]>();

		for (int rowIndex = 0; rowIndex < ROWS; rowIndex++)
		{
			for (int colIndex = 0; colIndex < COLUMNS; colIndex++)
			{
				if (heuristic[rowIndex][colIndex] >= 0 &&
						heuristic[rowIndex][colIndex] < min)
				{
					minPosition[0] = rowIndex;
					minPosition[1] = colIndex;
					min = heuristic[rowIndex][colIndex];
				}
			}
		}

		for (int rowIndex = 0; rowIndex < ROWS; rowIndex++)
		{
			for (int colIndex = 0; colIndex < COLUMNS; colIndex++)
			{
				if (heuristic[rowIndex][colIndex] == min)
				{
					candidates.add(new int[]{rowIndex, colIndex});
				}
			}
		}

		if (candidates.size() > 0)
		{
			minPosition = candidates.get(random.nextInt(candidates.size()));
		}

		return minPosition;
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
							//****************************************************************************
							//look ahead 
//							else if (isInBounds(nextRow + VERTICAL[move], nextColumn + HORIZONTAL[move]) &&
//										board[nextRow + VERTICAL[move]][nextColumn + HORIZONTAL[move]] == 0)
//							{
//							}
							//*****************************************************************************
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
