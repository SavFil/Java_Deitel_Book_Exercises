import java.util.Random;
import java.util.Arrays;

public class Main{
	public static final Random random = new Random();

	public static final boolean HARE = true;
	public static final boolean TORTOISE = false;

	public static final int FINISH_LINE = 70;
	public static final int STARTING_GATE = 1;
	public static final int POSITIONS = 71;

	public static final int[] TORTOISE_MOVE = {3, -6, 1};
	public static final int[] TORTOISE_CHANCES = {0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 2};
	public static final int FAST_PLOD = 0;
	public static final int SLIP      = 1;
	public static final int SLOW_PLOD = 2;

	public static final int[] HARE_MOVE = {0, 9, -12, 1, -2};
	public static final int[] HARE_CHANCES = {0, 0, 0, 1, 1, 2, 3, 3, 3, 4, 4};
	public static final int SLEEP      = 0;
	public static final int BIG_HOP    = 1;
	public static final int BIG_SLIP   = 2;
	public static final int SMALL_HOP  = 3;
	public static final int SMALL_SLIP = 4;

	public static void main(String[] args)
	{
		int harePosition = 1;
		int tortoisePosition = 1;
		String[] course = new String[POSITIONS];
		Arrays.fill(course, " ");

		while (!hasSomeoneFinished(harePosition, tortoisePosition))
		{
			harePosition = moveContender(harePosition, HARE_MOVE, HARE_CHANCES);
			tortoisePosition = moveContender(tortoisePosition, TORTOISE_MOVE, TORTOISE_CHANCES);

			if (harePosition == tortoisePosition)
			{
				course[harePosition] = "OUCH!!!";
			}
			else
			{
				course[harePosition] = "H";
				course[tortoisePosition] = "T";
			}
			printLine(course, harePosition, tortoisePosition);
		}

	}

	public static void printLine(String[] array, int harePosition, int tortoisePosition)
	{
		for (int position = 1; position < array.length; position++)
		{
			if (position < FINISH_LINE)
			{
				System.out.printf("%s,", array[position]);
			}
			else
			{
				System.out.printf("%s", array[position]);

				if (harePosition == tortoisePosition
						&& harePosition == FINISH_LINE)
				{
					System.out.print("It's a tie");
				}else if (harePosition == FINISH_LINE)
				{
					System.out.print(" Hare wins.Yuch");
				}
				else if (tortoisePosition == FINISH_LINE)
				{
					System.out.print(" TORTOISE WINS!!! YAY!!!");
				}
			}
		}
		System.out.println();
	}

	public static int moveContender(int contenderPosition, int[] contenderMove, int[] contenderChances)
	{
		int moveType = contenderChances[chance()];
		int newPosition = contenderPosition;
		int tmpPosition = contenderPosition + contenderMove[moveType];

		if (tmpPosition >= FINISH_LINE)
		{
			newPosition = FINISH_LINE;
		}
		else if (tmpPosition < STARTING_GATE)
		{
			newPosition = STARTING_GATE;
		}
		else
		{
			newPosition = tmpPosition;
		}

		return newPosition;

	}

	public static int chance()
	{
		return 1 + random.nextInt(10);
	}

	public static boolean hasSomeoneFinished(int harePosition, int tortoisePosition)
	{
		return harePosition >= FINISH_LINE || tortoisePosition >= FINISH_LINE;
	}


}
