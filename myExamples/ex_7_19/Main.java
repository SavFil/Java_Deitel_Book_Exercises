import java.util.Scanner;

public class Main{

	private static final Scanner input = new Scanner(System.in);
	private static enum Status {COMPLETED, REJECTED, CHANGED};
	private static final int FIRST_CLASS = 1;
	private static final int ECONOMY = 2;
	private static Status status;
	private static int seat = 0;

	public static void main(String[] args)
	{
		
		boolean[] seats = new boolean[10];

		for (int counter = 0; counter <  seats.length; counter++)
		{
			System.out.println("1 First class");
			System.out.println("2 Economy");
			int choice = input.nextInt();
			status = Status.CHANGED;

			while (status == Status.CHANGED)
			{
				if (choice == FIRST_CLASS)
				{
					availableSeat(seats, 0, 5);
					if (status == Status.CHANGED)
					{
						alternativeSeat(seats, 5, seats.length);
					}
					break;
				}
				else if (choice == ECONOMY)
				{
					availableSeat(seats, 5, seats.length);	
					if (status == Status.CHANGED)
					{
						alternativeSeat(seats, 0, 5);
					}
					break;
				}
			}
			
			String output = "";
			switch (status)
			{
				case COMPLETED:
					output = seat < 5 ? String.format("You reserved seat number %d of the first class%n", seat + 1) : 
										String.format("You reserverd seat number %d of the economy class%n", seat + 1);
					break;
				case REJECTED:
					output = String.format("Next flight leaves in 3 hours%n");
					break;
			}
			System.out.print(output);

		}

	}
	

	public static void availableSeat(boolean seats[], int start, int end)
	{
		for (int index = start; index < end; index++)
		{
			if (!seats[index])
			{
				seats[index] = true;
				seat = index;
				status = Status.COMPLETED;
				break;
			}
		}
	}

	public static void alternativeSeat(boolean[] seats, int start, int end)
	{

		for (int index = start; index < end; index++)
		{
			if (!seats[index])

			{
				System.out.println("No available seats in the first class, do you want economy class?");
				int change = input.nextInt();
				if (change == 1)
				{
					seats[index] = true;
					seat = index;
					status = Status.COMPLETED;
				}
				else if (change == 2)
				{
					status = Status.REJECTED;
				}
				break;
			}
		}
	}
}
