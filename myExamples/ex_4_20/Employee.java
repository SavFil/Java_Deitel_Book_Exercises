public class Employee{

	private int workHours;
	private double rate;
	private final int FULL_TIME = 40;

	public Employee(int workHours, double rate)
	{
		this.workHours = workHours;
		this.rate = rate;
	}

	public int getWorkHours()
	{
		return workHours;
	}

	public void setWorkHours(int workHours)
	{
		this.workHours = workHours;
	}

	public double getRate()
	{
		return rate;
	}

	public void setRate(double rate)
	{
		this.rate = rate;
	}

	public double grossPay()
	{
		return 0.5 * rate * (FULL_TIME + workHours);
	}
}
