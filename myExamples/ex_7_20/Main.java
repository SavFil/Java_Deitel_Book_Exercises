public class Main{

	public static void main(String[] args)
	{
		final int ROWS = 5;
		final int COLUMNS = 4;
		int[][] slips = {{0, 0, 100},
					     {0, 1, 50 },
						 {0, 2, 200},
						 {0, 3, 100},
					     {0, 4, 50 },
						 {1, 0, 240},
						 {1, 1, 3  },
					     {1, 2, 30 },
						 {1, 3, 100},
						 {1, 4, 6  },
					     {2, 0, 30 },
						 {2, 1, 250},
						 {2, 2, 30 },
					     {2, 3, 90 },
						 {2, 4, 230},
						 {3, 0, 9  },
					     {3, 1, 54 },
						 {3, 2, 234},
						 {3, 3, 3  },
					     {3, 4, 90 },
						 {0, 0, 100},
					     {0, 1, 50 },
						 {0, 2, 200},
						 {0, 3, 100},
					     {0, 4, 50 },
						 {1, 0, 240},
						 {1, 1, 3  },
					     {1, 2, 30 },
						 {1, 3, 100},
						 {1, 4, 6  },
					     {2, 0, 30 },
						 {2, 1, 250},
						 {2, 2, 30 },
					     {2, 3, 90 },
						 {2, 4, 230},
						 {3, 0, 9  },
					     {3, 1, 54 },
						 {3, 2, 234},
						 {3, 3, 3  },
					     {3, 4, 90 },
						 {0, 0, 100},
					     {0, 1, 50 },
						 {0, 2, 200},
						 {0, 3, 100},
					     {0, 4, 50 },
						 {1, 0, 240},
						 {1, 1, 3  },
					     {1, 2, 30 },
						 {1, 3, 100},
						 {1, 4, 6  },
					     {2, 0, 30 },
						 {2, 1, 250},
						 {2, 2, 30 },
					     {2, 3, 90 },
						 {2, 4, 230},
						 {3, 0, 9  },
					     {3, 1, 54 },
						 {3, 2, 234},
						 {3, 3, 3  },
					     {3, 4, 90 }};

		int[][] sales = new int[ROWS][COLUMNS];
		
		for (int[] slip : slips)
		{
			sales[slip[1]][slip[0]] +=  slip[2];
		}

		System.out.printf("       Salesperson    1    2    3    4    Total by product%n");
		System.out.printf("Product%n%n");
		for (int row = 0; row < sales.length; row++)
		{
			int sumByProduct = 0;
			System.out.printf("%7d           ", row + 1);
			for (int col = 0; col < sales[row].length; col++)
			{
				sumByProduct += sales[row][col];
				System.out.printf("%5d", sales[row][col]); 
			}
			System.out.printf("%20d%n", sumByProduct);
		}
		System.out.printf("%nTotal by %n  month           ");
		for (int col = 0; col < COLUMNS; col++)
		{
			int sumByMonth = 0;
			for (int row = 0; row < sales.length; row++)
			{
				sumByMonth += sales[row][col];
			}
			System.out.printf("%5d", sumByMonth);
		}
		
		
	}
}
