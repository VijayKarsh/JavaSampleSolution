package com.techment.practice;

public class SavingsAccount {

	float balance;
	float interest;
	/**
	 * @param balance
	 * @param interest
	 */
	public SavingsAccount(float balance, float interest) {
		super();
		this.balance = balance;
		this.interest = interest;
	}

	public void withdraw(int amount) {
		if(amount>balance) {
			System.out.println("Insufficient Fund");
		}
		else {
			System.out.println("Withdraw successfully");
			balance=balance-amount;
			System.out.println("balance : "+balance);
		}
	}
	
	public void deposite(int amount) {
		System.out.println("Deposite Successfully");
		balance=balance+amount;
		System.out.println("balance : "+balance);
	}






	public static void main(String[] args) {
		SavingsAccount sa =new SavingsAccount(5000, 5);
		sa.deposite(10000);
		sa.withdraw(2000);

	}

}
