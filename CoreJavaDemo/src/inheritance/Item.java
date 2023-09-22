package inheritance;
/**
 * super / parent/ base
 * define certain characteristics and behaviour common across classes
 * is-a relationship
 */
/**
 * Abstract classes
 * 1. abstract is a modifier
 * 2. Can be used on class and methods 
 * 3. If a class is declared as abstract :
 * 	a. you cannot create the object of the class using new/ instantiate
 * 	b. abstract classes may or may not have abstract methods but if a class has even
 * one abstract methiod hten the class needs to be declared as abstarct
 * 4. abstract methods do not have implementations
 * 5. abstract methods needs to be implemented by the respective child classes or
 * child classes should declare them as abstract
 */
public abstract  class Item extends Object{

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
	
	public abstract double calculateMrp();
//	{
//		System.out.println("item cal price");
//		return price + price * 0.10;
//	}
	
	
}
