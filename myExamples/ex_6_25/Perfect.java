public class Perfect{

	public static void main(String[] args)
	{
		for (int counter = 2; counter <= 100000; counter++)
		{
			if (isPerfect(counter))
				System.out.println(counter);
		}

	}

	public static boolean isPerfect(int number)
	{
		int temp = 1;

		for (int counter = 2; counter < number; counter++)
		{
			if (isMultiple(number, counter))
				temp += counter; 
		}

		return temp == number ? true : false;
	}

	public static boolean isMultiple(int first, int second)
	{
		return first % second == 0 ? true : false; 
	}
}
