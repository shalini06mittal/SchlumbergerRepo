package overriding;

import com.hasa.Employee;

public class Main {

	// BA => 2 child classes,  4 child classes
	//	public static void callWithdraw(SavingsAccount obj,  double amt)
	//	{
	//		obj.withdraw(amt);
	//	}
	//	public static void callWithdraw(CurrentAccount obj,  double amt)
	//	{
	//		obj.withdraw(amt);
	//	}
	//	public static void callWithdraw(JanDhanAccount obj,  double amt)
	//	{
	//		obj.withdraw(amt);
	//	}
	/**
	 * reference decides which methods can be called. obj
	 * object passed to the reference decides form which class will it be called
	 * new SA() => withdraw of SA will be called
	 * new BA() => withdraw of BA will be called
	 * new CA()  => withdraw of BA is called since CA does not define or 
	 * override the withdraw method. hence it inherits from the parent class
	 */
	public static void callWithdraw(BankAccount obj,  double amt)
	{
		obj.withdraw(amt);
		// downcast
		if(obj instanceof SavingsAccount)
		{
			// obj = new BA() obj = new CA()
			SavingsAccount s = (SavingsAccount)obj;
			System.out.println(s.getInterest());
		}

	}
	public static void main(String[] args) {
		BankAccount b1  = new BankAccount("A001",1000);
		SavingsAccount s1 = new SavingsAccount("Hemant", 2500);
		CurrentAccount c1 = new CurrentAccount("Sejal", 5000);
		System.out.println(b1 instanceof BankAccount);
		System.out.println(c1 instanceof BankAccount);
		System.out.println(s1 instanceof BankAccount);
		System.out.println(s1 instanceof SavingsAccount);
		System.out.println(c1 instanceof BankAccount);

		//		b1.withdraw(500);// BA
		//		s1.withdraw(500); // SA
		//		c1.withdraw(300); //BA
		callWithdraw(b1, 200); // 
		callWithdraw(s1, 200);
		callWithdraw(c1, 200);
		//callWithdraw(new Employee(), 200);

	}


}