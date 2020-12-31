public class Main{
	
	public static void main(String[] args){
		
		int x = 4;
		int y = 8;
		int a = 1;
		int b = 2;
		int g = 3;
		int i = 8;
		int j = 9;

		if (!(x < 5) && !(y >= 7))
			System.out.println("true");
	    else
			System.out.println("false");

		if (!(x < 5 || y >= 7))
			System.out.println("true");
		else
			System.out.println("false");

		if (!(a == b) || !(g != 5))
			System.out.println("true");
		else
			System.out.println("false");

		if (!((a == b) && (g != 5)))
			System.out.println("true");
		else
			System.out.println("false");

		if (!((x <= 8) && (y > 4)))
			System.out.println("true");
		else 
			System.out.println("false");

		if (!(x <= 8) || !(y > 4))
			System.out.println("true");
		else
			System.out.println("false");

		if (!((i > 4) || (j <= 6)))
			System.out.println("true");
		else
			System.out.println("false");

		if (!(i > 4) && !(j <= 6))
			System.out.println("true");
		else
			System.out.println("false");
	}

}

