public class Main{

	public static void main(String[] args)
		throws InterruptedException
	{
		int i = 2;
		
		while(true){
			System.out.println(i *= 2);
			Thread.sleep(1000);
		}
		
	}


}
