package overloading;

public class TestOverloading {

	public static void main(String[] args) {
		MethodOverloading m1 = new MethodOverloading();
		m1.add(2, 3);// int int
		m1.add(2.0f, 0);//float int
		m1.add(3, 2.3);
		m1.add(2, 3, 4);
		//m1.add(2);

	}

}
