package interfaces;

public class CreditCard  implements Payment{

	@Override
	public void pay() {
		
		System.out.println("pay by credit card");
	}

//	@Override
//	public void notify(String email) {
//		// TODO Auto-generated method stub
//		
//	}

}
