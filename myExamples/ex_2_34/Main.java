import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Input population and annual growth rate");
		long population = input.nextLong();
		double growthRate = input.nextDouble();
		input.close();

		System.out.printf("%n%s%n%-6s%f%n%-6s%f%n%-6s%f%n%-6s%f%n%-6s%f%n",
						  "Estimated world population in N year(s)",
						  "1-y", population * growthRate,
						  "2-y", population * Math.pow(growthRate, 2.0),
						  "3-y", population * Math.pow(growthRate, 3.0),
						  "4-y", population * Math.pow(growthRate, 4.0),
						  "5-y", population * Math.pow(growthRate, 5.0));
	}

}
