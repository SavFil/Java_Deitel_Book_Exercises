public class Main{

	public static void main(String[] args)
	{
		
		Account account1 = new Account(12345, 0,
				200, 150, 300);


		account1.newBalance();
		System.out.printf("%d %s", account1.getBalance(), account1.isCreditLimitExceeded());
	}

}
