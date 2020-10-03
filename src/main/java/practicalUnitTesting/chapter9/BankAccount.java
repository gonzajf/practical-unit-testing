package practicalUnitTesting.chapter9;

public class BankAccount {

	private int balance;

	public void deposit(int i) {
		balance += i;
	}

	public void withdraw(int i) {
		balance -= i;
	}

	public int getBalance() {
		return balance;
	}
}
