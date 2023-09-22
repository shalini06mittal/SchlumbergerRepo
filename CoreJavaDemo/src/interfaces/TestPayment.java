package interfaces;

public class TestPayment {

	public static void main(String[] args) {
		Payment p = new CreditCard();
		p.pay();
		p.notify("shalini");
		
		p = new Neft();
		p.pay();
	}

}
