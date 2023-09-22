package overriding;

public class SavingsAccount extends BankAccount{

	private double interest;
	
    public SavingsAccount(String name, double balance){
        super(name, balance);
    }

    
    public double getInterest() {
		return interest;
	}


	public void setInterest(double interest) {
		this.interest = interest;
	}


	@Override
    public void withdraw(double amount) {
    	System.out.println("savings Account withdraw");
        if(getBalance() - amount < 100){
            System.out.println("You have insufficient funds");
        }
        else{
            super.withdraw(amount);
        }
    }
}
