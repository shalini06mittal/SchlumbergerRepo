package com.oops;

public class TestAccount {

	public static void main(String[] args) {
		Account a1 = new Account(1, "A1");
		Account a2 = new Account(1, "A1",10000);
		System.out.println(a1.withdraw(1000));
		a2.transfer(a1, 2000);
		System.out.println(a2.getBalance());
		System.out.println(a1.getBalance());
		System.out.println(a1.withdraw(1000));
		System.out.println(a1.getBalance());
	}

}
