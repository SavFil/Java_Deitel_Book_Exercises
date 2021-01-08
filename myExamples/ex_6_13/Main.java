import java.util.Random;

public class Main{
	
	private static final Random random = new Random();

	public static void main(String[] args)
	{
		System.out.println(2 + 2 * random.nextInt(5));
		System.out.println(3 + 2 * random.nextInt(5));
		System.out.println(6 + 4 * random.nextInt(5));

	}

}
