package inheritance;

/*
 * for inheritance "extends" keyword is used
 * sub / child / derived
 * whenever child object is created , parent constructor is mandatorily called
 * 
 */
public class Book extends Item{

	private String title;
	
	public Book() {
		//super();
		System.out.println("Book default");
	}
	// constructor, getters and setters

	public Book(int id, String description, double price, String title) {
		// super is used to access immediate parent methods or call the constructor
		super(id, description, price);
		//super(id, price, description);
		System.out.println("Book parameterized const");
//		if(id <=0) {
//			System.out.println("id cannot be 0");
//		}
//		else
//			this.setId(id);
//		setDescription(description);
//		setPrice(price);
		this.title = title;
	}


	public String getTitle() {
		return title;
	}

	
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * overriding rules
	 * 1. method signature should exactly be same as parent class
	 */
	@Override
	public double calculateMrp() {
		// TODO Auto-generated method stub
		System.out.println("Book calculate price");
		return getPrice() + getPrice() * 0.05;
	}
	// overloading
	public double calculateMrp(double disc) {
		// TODO Auto-generated method stub
		System.out.println("Book calculate price");
		return getPrice() + getPrice() * 0.05 - getPrice() * disc;
	}
	
}
