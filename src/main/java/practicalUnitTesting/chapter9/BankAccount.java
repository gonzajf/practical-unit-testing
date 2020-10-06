package practicalUnitTesting.chapter9;

import practicalUnitTesting.chapter10.InvalidAmountException;
import practicalUnitTesting.chapter10.NotEnoughMoneyException;

public class BankAccount {

	private int balance;

	public void deposit(int i) throws InvalidAmountException {

		if(i < 0) {
			throw new InvalidAmountException();
		}
		
		balance += i;
	}

	public void withdraw(int i) throws NotEnoughMoneyException, InvalidAmountException {
		
		if(i < 0) {
			throw new InvalidAmountException();
		}
		
		if(i > balance) {
			throw new NotEnoughMoneyException();
		}
		balance -= i;
	}

	public int getBalance() {
		return balance;
	}
}
