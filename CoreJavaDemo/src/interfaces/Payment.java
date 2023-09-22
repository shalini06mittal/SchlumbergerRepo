package interfaces;
// contracts
public interface Payment {

	public void pay();
	// default method => default implementation
	public default void notify(String email) {
		System.out.println("send email");
	}
}
