import java.util.Scanner;

public class Main{

	public static void main(String[] args)
	{

		Scanner input = new Scanner(System.in);
		int product = 0;
		int quantity = 1;
		double total = 0.0;

		do{			
			System.out.printf("Product number and quantity: %n");
			product = input.nextInt();
			quantity = input.nextInt();
			

			switch (product)
			{

				case 1:
					total += quantity * 2.98;
					break;
				case 2:
					total += quantity * 4.50;
					break;
				case 3:
					total += quantity * 9.98;
				case 4:
					total += quantity * 4.49;
				case 5:
					total += quantity * 6.87;
				default:
					break;
			}
			System.out.printf("Total cost: %.2f$%n", total);

		}while (product != -1 && quantity != -1); 
	}

}
