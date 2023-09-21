package inheritance;

public class TestInheritance {

	public static void main(String[] args) {
//		Item item1 = new Item();
		Book b1 = new Book(1,"some desc",234, "some title");
		System.out.println(b1.getTitle());
		System.out.println(b1.getPrice());
		System.out.println(b1.getDescription());
		System.out.println(b1.calculateMrp());
//		b1.setDescription("some desc");
//		b1.setId(1);
//		b1.setPrice(240);
//		b1.setTitle("some title");
//		System.out.println(b1.getTitle());
		
	}
}
