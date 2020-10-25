public class Invoice{

	private String partNumber;
	private String partDescription;
	private int itemQuantity;
	private double pricePerItem;

	public Invoice(String partNumber, String partDescription, int itemQuantity, double pricePerItem)
	{
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.itemQuantity = itemQuantity;
		this.pricePerItem = pricePerItem;
	}

	public String getPartNumber()
	{
		return partNumber;
	}

	public void setPartNumber(String partNumber)
	{
		this.partNumber = partNumber;
	}

	public String getPartDescription()
	{
		return partDescription;
	}

	public void setPartDescription(String partDescription)
	{
		this.partDescription = partDescription;
	}

	public int getItemQuantity()
	{
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuanity)
	{
		this.itemQuantity = itemQuantity;
	}

	public double getPricePerItem()
	{
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem)
	{
		this.pricePerItem = pricePerItem;
	}

	public double getInvoiceAmount()
	{
		if (itemQuantity <= 0)
			itemQuantity = 0;
		if (pricePerItem <= 0)
			pricePerItem = 0.0;

		return itemQuantity * pricePerItem;
	}



}
