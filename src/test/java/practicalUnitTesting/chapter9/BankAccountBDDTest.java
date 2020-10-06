package practicalUnitTesting.chapter9;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import practicalUnitTesting.chapter10.InvalidAmountException;
import practicalUnitTesting.chapter10.NotEnoughMoneyException;

public class BankAccountBDDTest {

	@Test
	public void shouldBeEmptyAfterCreation() {
		// given
		BankAccount account = new BankAccount();
		// when
		int balance = account.getBalance();
		// then
		assertEquals(0, balance);
	}

	@Test
	public void shouldAllowToCreditAccount() throws InvalidAmountException {
		// given
		BankAccount account = new BankAccount();
		// when
		account.deposit(100);
		// then
		int balance = account.getBalance();
		assertEquals(100, balance);
	}

	@Test
	public void shouldAllowToDebitAccount() throws NotEnoughMoneyException, InvalidAmountException {
		// given
		BankAccount account = new BankAccount();
		// when
		account.deposit(100);
		account.withdraw(40);
		// then
		int balance = account.getBalance();
		assertEquals(60, balance);
	}
}