public class Main{

	public static void main(String[] args)
	{
		Invoice invoice1 = new Invoice("abc123", "APPLES", 10, 0.3);
		Invoice invoice2 = new Invoice("def456", "BANANAS", 4, 0.5);

		System.out.printf("%n%-10s%-10s%-10s%n%-10s%-10d%-10.2f%n%-10s%-10d%-10.2f", "Item", "Quantity", "Total Price", invoice1.getPartDescription(), invoice1.getItemQuantity(), invoice1.getInvoiceAmount(), invoice2.getPartDescription(), invoice2.getItemQuantity(), invoice2.getInvoiceAmount());
	}

}
