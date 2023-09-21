package utilities;

import java.util.Scanner;

public class Main {
	private static BankAccount account;

	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String choice;
		do {
			System.out.println("Choose an option (a)Add Account " +
					"(q)Quit");
			choice = sc.nextLine().toUpperCase();
			switch (choice) {
			case "A":
				AddAccount();
				break;
			case "Q":
				System.out.println("Goodbye :)");
				break;
			default:
				System.out.println("Not a valid option");
			}
		} while(!choice.toUpperCase().equals("Q"));
		sc.close();
}


private static void AddAccount(){
	try{
		System.out.println("Enter the account holder: ");
		String holder = sc.nextLine();
		if(holder.length() == 0){
			System.out.println("You must enter an account name");
			return;
		}
		System.out.println("Enter the account opening balance: ");
		double balance = Double.parseDouble(sc.nextLine());
		System.out.println("Enter the Account type (s)Savings Account (a)Normal Account");
		String choice = sc.nextLine();

		if(choice.toUpperCase().equals("S")){
			account = new SavingsAccount(holder,balance);
		}
		else if(choice.toUpperCase().equals("A")){
			account = new BankAccount(holder,balance);
		}
		else{
			System.out.println("Invalid Account type");
			return;
		}
		displayAccount(account);
	}
	catch(NumberFormatException ex) {
		System.out.println("You must enter a number for the balance");
	}

}

private static void displayAccount(BankAccount account){
	if(account instanceof SavingsAccount){
		System.out.printf("Savings Account %s has balance %.2f\n", account.getAccount(),account.getBalance());
	}
	else{
		System.out.printf("Current Account %s has balance %.2f\n",account.getAccount(),account.getBalance());
	}
}


}