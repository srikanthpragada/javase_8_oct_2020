package oop;

public class SavingsAccount {
	// Instance variables
	private int acno;
	private String ahname;
	private double balance;
	
	// Static or class variables
	private static int minbal = 5000;

	public static int getMinbal() {
		return SavingsAccount.minbal;
	}
	
	// Constructor
	public SavingsAccount(int acno, String ahname) {
		this.acno = acno;
		this.ahname = ahname;
	}

	public SavingsAccount(int acno, String ahname, double balance) {
		this(acno, ahname); // call another constructor
		this.balance = balance;
	}

	// Methods
	public void print() {
		System.out.println(this.acno);
		System.out.println(this.ahname);
		System.out.println(this.balance);
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		if (this.balance - SavingsAccount.minbal >= amount)
			this.balance -= amount;
		else
			System.out.println("Sorry! Insufficient Funds!");
	}

	public double getBalance() {
		return this.balance;
	}
}
