public class Account{

	private int accountNumber;
	private int balance;
	private int chargeTotal;
	private int credits;
	private int creditLimit;

	public Account(int accountNumber, int balance,
			int chargeTotal, int credits, int creditLimit)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.chargeTotal = chargeTotal;
		this.credits = credits;
		this.creditLimit = creditLimit;
	}

	public int getAccountNumber()
	{
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}

	public int getBalance()
	{
		return balance;
	}

	public void setBalance(int balance)
	{
		this.balance = balance;
	}

	public int getChargeTotal()
	{
		return chargeTotal;
	}

	public void setChargeTotal(int chargeTotal)
	{
		this.chargeTotal = chargeTotal;
	}


	public int getCredits()
	{
		return credits;
	}

	public void setCredits(int credits)
	{
		this.credits = credits;
	}

	public int getCreditLimit()
	{
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit)
	{
		this.creditLimit = creditLimit;
	}

	public void newBalance()
	{
		balance = balance + chargeTotal - credits;
	}

	public boolean isCreditLimitExceeded()
	{
		return balance > creditLimit;
	}
}
