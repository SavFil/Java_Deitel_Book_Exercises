public class Main{

	public static void main(String[] args)
	{
		for (int counter = 3; counter < 100000; counter+=2)
			if (isPrime(counter))
				System.out.println(counter);

	}
	
	public static boolean isPrime(int number)
	{
		for (int counter = 3; counter < Math.sqrt(number); counter++)
			if (Perfect.isMultiple(number, counter))
					return false;
		return true;
	}
}
