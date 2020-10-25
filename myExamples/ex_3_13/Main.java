public class Main{

	public static void main(String[] args)
	{
		Employee employee1 = new Employee("Tom", "Jones", 2000.000);
		Employee employee2 = new Employee("John", "Miles", 2300.00);

		System.out.printf("%n%-11s%-11s%s%n%-11s%-11s%-10.2f%n%-11s%-11s%-11.2f%n%n%s%n", "First Name", "Last Name", "Yearly Salary",
				employee1.getFirstName(), employee1.getLastName(), employee1.getSalary() * 12,
				employee2.getFirstName(), employee2.getLastName(), employee2.getSalary() *12,
				"After a 10% raise:");

		employee1.setSalary(employee1.getSalary() + 0.1 * employee1.getSalary());
		employee2.setSalary(employee2.getSalary() + 0.1 * employee2.getSalary());

		System.out.printf("%n%-11s%-11s%-11.2f%n%-11s%-11s%-11.2f",
				employee1.getFirstName(), employee1.getLastName(), employee1.getSalary() * 12,
				employee2.getFirstName(), employee2.getLastName(), employee2.getSalary() * 12);
	}

}
