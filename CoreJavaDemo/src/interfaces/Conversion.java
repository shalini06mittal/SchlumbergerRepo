package interfaces;

public class Conversion {
	// obj = new String();
	// obj = new Emp();
	// obj = new Student()
	public static String convertToBinary(Object obj) {
		// get id and name of emp
		// get id, title and author of book
		if (obj instanceof Book) {
			Book b1 = (Book)obj;
		}
		if(obj instanceof Emp) {
			Emp emp = (Emp)obj;
		}
		
		
		return "converted to binary";
	}
}
