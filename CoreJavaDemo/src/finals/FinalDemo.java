package finals;
/**
 * final
 * 1. it can be used anywhere except constructors
 * 2. if used on variable => becomes constant
 * 3. if used on method => cannot override
 * 4. if used on class => cannot inherit
 */
public class FinalDemo {

	public static void main(String[] args) {
		final double pi = 22.7;
		//pi = 23;
	}
}
final class A{
	A(){
		
	}
	public final void m1() {}
	public  void m2() {

	}
}

//class B extends A{
//	@Override
//	public void m2() {
//		// TODO Auto-generated method stub
//		super.m2();
//	}
//
//}
