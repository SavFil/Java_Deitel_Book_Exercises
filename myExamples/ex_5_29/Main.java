public class Main{
	
	public static void main(String[] args)
	{
		String day = "";
		String verse = "A partridge in a pear tree\n"; 
		for (int i = 1; i <= 12; i++)
		{
			System.out.print("On the");
			switch(i)
			{
				case 1:
					day = "first";
					break;
				case 2:
					day = "second";
					break;
				case 3:
					day = "third";
					break;
				case 4:
					day = "fourth";
					break;
				case 5:
					day = "fifth";
					break;
				case 6:
					day = "sixth";
					break;
				case 7:
					day = "seventh";
					break;
				case 8:
					day = "eigth";
					break;
				case 9:
					day = "ninth";
					break;
				case 10:
					day = "tenth";
					break;
				case 11:
					day = "eleventh";
					break;
				case 12:
					day = "twelfth";
					break;
				default:
					break;
			}
			System.out.printf(" %s day of Christmas my true love gave to me%n", day);
			
			switch(i)
			{

				case 1:
					break;
				case 2:
					verse = "Two turtle doves, and\n" + verse;
					break;
				case 3:
					verse = "Three french hens\n" + verse;
					break;
				case 4:
					verse = "Four calling birds\n" + verse;
					break;
				case 5:
					verse = "Five golden rings\n" + verse;
					break;
				case 6:
					verse = "Six geese a-laying\n" + verse;
					break;
				case 7:
					verse = "Seven swans a-swimming\n" + verse;
					break;
				case 8:
					verse = "Eight maids a-milking\n" + verse;
					break;
				case 9:
					verse = "Nine ladies dancing\n" + verse;
					break;
				case 10:
					verse = "Ten lords a-leaping\n" + verse;
					break;
				case 11:
					verse = "Eleven pipers piping\n" + verse;
					break;
				case 12:
					verse = "Twelve drummers drumming\n" + verse;
					break;
				default:
					break;
			}
			System.out.print(verse);

			System.out.println();
		}
	}

}

