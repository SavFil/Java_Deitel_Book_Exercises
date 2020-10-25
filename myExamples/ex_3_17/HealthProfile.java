public class HealthProfile{

	private HeartRates heartRates;
	private String gender;
	private double height;
	private double weight;

	public HealthProfile(HeartRates heartRates, String gender,
			double height, double weight)
	{
		this.heartRates = heartRates;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}

	public HeartRates getHeartRates()
	{
		return heartRates;
	}

	public void setHeartRates(HeartRates heartRates)
	{
		this.heartRates = heartRates;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}

	public double getWeight()
	{
		return weight;
	}

	public void setWeight(double weight)
	{
		this.weight = weight;
	}

	public double BMI()
	{
		return weight / Math.pow(height, 2.0);
	}
	
	public String toString()
	{
		return String.format("%s%n%s%f%n%s%n%-13s%s%n%-13s%s%n%-13s%s%n%-13s%s%n", heartRates, "Your BMI index: ", BMI(), "BMI VALUES", "Underweight:", "less than 18.5", "Normal:", "between 18.5 and 24.9", "Overweight:", "between 25 and 29.9", "Obese:", "30 or greater");
	}
}
