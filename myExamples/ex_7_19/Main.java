import java.util.Scanner;

public class Main{

	private static enum Status {COMPLETED, REJECTED, CHANGED};
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		boolean[] seats = new boolean[10];

		for (int counter = 0; counter <  seats.length; counter++)
		{
			System.out.println("1 First class");
			System.out.println("2 Economy");
			int choice = input.nextInt();
			Status status = Status.CHANGED;
			int seat = 0;

			while (status == Status.CHANGED)
			{
				switch(choice)
				{
					case 1:
						for (int index = 0; index < 5; index++)
						{
							if (!seats[index])
							{
								seats[index] = true;
								seat = index;
								status = Status.COMPLETED;
								break;
							}
						}
						if (status == Status.CHANGED)
						{
							status = Status.REJECTED;
							for (int index = 5; index < seats.length; index++)
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
										break;
									}
								}
							}
						}
						break;
					case 2:
						for (int index = 5; index < seats.length; index++)
						{
							if (!seats[index])
							{
								seats[index] = true;
								seat = index;
								status = Status.COMPLETED;
								break;
							}
						}
						if (status == Status.CHANGED)
						{
							status = Status.REJECTED;
							for (int index = 0; index < 5; index++)
							{
								if (!seats[index])
								{
									System.out.println("No available seats in the Economy class, do you want first class?");
									int change = input.nextInt();
									if (change == 1)
									{
										seats[index] = true;
										seat = index;
										status = Status.COMPLETED;
										break;
									}
								}
							}
						}
						break;

				}

				switch (status)
				{
					case COMPLETED:
						if (seat < 5)
						{
							System.out.printf("You reserved seat number %d of the first class%n", seat);
						}
						else
						{
							System.out.printf("You reservers seat number %d of the economy class%n", seat);
						}
						break;
					case REJECTED:
						System.out.println("Next flight leaves in 3 hours");
						break;
				}

			}

		}
	}

}
