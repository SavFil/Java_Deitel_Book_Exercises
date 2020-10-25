import java.time.Year;

public class HeartRates{

	private String firstName;
	private String lastName;
	private DoB dob;
	private int currentYear = Year.now().getValue();

	public HeartRates(String firstName, String lastName, DoB dob)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public DoB getDoB()
	{
		return dob;
	}

	public void setDoB(DoB dob)
	{
		this.dob = dob;
	}

	public int age()
	{
    	return currentYear - dob.getYear();
	}

	public int maxHeartRate()
	{
		return 220 - this.age();
	}

	public String targetHeartRate()
	{
		return String.format("%.2f - %.2f", 0.5 * this.maxHeartRate(), 0.85 * this.maxHeartRate());
	}
}
