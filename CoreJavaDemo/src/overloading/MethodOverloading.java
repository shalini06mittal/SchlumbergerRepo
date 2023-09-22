package overloading;

public class MethodOverloading {

	// 2 methods with exactly the same signature cannot be there in the same class
//	public int add(int a, int b)
//	{
//		return a+b;
//	}
	public int add(int a, int b)
	{
		System.out.println("int , int");
		return a+b;
	}
	// number of parameters
	public int add(int a, int b, int c)
	{
		System.out.println("int , int, int");
		return a+b+c;
	}
	// type of parameters
	public double add(double a, int b)
	{
		System.out.println("double , int");
		return a+b;
	}
	// sequence of parameters
	public double add(int a, double b)
	{
		System.out.println("int , double");
		return a+b;
	}
	public double add(float a, int b)
	{
		System.out.println("float , int");
		return a+b;
	}
	// Just changing the return type is not overloading
//	public double add(int a, int b)
//	{
//		return a+b;
//	}
	// changind method name is not overloading
	public int add1(int a, int b)
	{
		return a+b;
	}
	
}
