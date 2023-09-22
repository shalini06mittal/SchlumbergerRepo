package interfaces;

public class Test {

	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.setId(1);
		e1.setName("emo1");
		
		Book b1 = new Book();
		b1.setId(1);
		b1.setAuthor("some author");
		b1.setTitle("some title");
		
		System.out.println("Book "+Conversion.convertToBinary(b1));
		System.out.println("emp " +Conversion.convertToBinary(e1));

	}

}
