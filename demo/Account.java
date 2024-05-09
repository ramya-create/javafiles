package demo;

public class Account {
	private int accId;
	private String holderName;
	private double balance;
	
	public Account(int accId, String holderName, double balance) {
		this.accId=accId;
		this.holderName=holderName;
		this.balance=balance;
	}
	
	
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println(amount + "successfully deposited");
	}
	
	public void withdraw(double amount) {
		if(amount<1000 && amount<=balance) {
			balance=balance-amount;
			System.out.println(amount + "successfully withdrawn");
		}
		else {
			System.out.println("your withdrawal amount should be less than 1000 and balance");
			
		}
	}
	
	public void transferAmount(Account account2, double amount) {
		if(amount > balance) {
			System.out.println("insufficient balance, transfer failed");
		}
		else {
			balance=balance-amount;
			account2.deposit(amount);
			System.out.println(amount + "successfully transfered" + account2.holderName);
		}
	}

	public int getAccId() {
		return accId;
	}
	
	public void setAccId(int accId) {
		this.accId=accId;
	}
	
	public String getHolderName() {
		return holderName;
	}
	
	public void setHolderName(String holderName) {
		this.holderName=holderName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	
}

	

