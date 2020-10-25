public class Main{

	public static void main(String[] args)
	{
		for (int i = 0; i < 8; i++)
			System.out.printf("%n%s", i % 2 == 0 ? "* * * * * * * *" : " * * * * * * * *");
	}
}
