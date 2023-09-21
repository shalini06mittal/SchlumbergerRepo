package inheritance;
/**
 * super / parent/ base
 * define certain characteristics and behaviour common across classes
 * is-a relationship
 */
public class Item extends Object{

	private int id;
	private String description;
	private double price;//0.0
	public Item() {
		System.out.println("Item default");
	}
	public Item(int id, String description, double price) {
		System.out.println("Item parameterized");
		if(id <=0) {
			System.out.println("id cannot be 0");
		}
		else
			this.id = id;
		this.description = description;
		this.price = price;
	}
//	public Item(int id, double price) {
//		System.out.println("Item parameterized");
//		if(id <=0) {
//			System.out.println("id cannot be 0");
//		}
//		else
//			this.id = id;
//		
//		this.price = price;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		// Locale => conversion
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double calculateMrp()
	{
		System.out.println("item cal price");
		return price + price * 0.10;
	}
	
	
}
