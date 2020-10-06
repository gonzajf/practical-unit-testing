package practicalUnitTesting.chapter10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import practicalUnitTesting.chapter9.BankAccount;

/**
 * An example of a suboptimal test of the BankAccount class is presented. Each test method attempts to test
 * a single method of the public API of BankAccount : getBalance(), deposit() and withdraw()
 */
public class BankAccountTest {

	private BankAccount account = new BankAccount();

	@Test
	public void testBalance() throws InvalidAmountException {
		account.deposit(200);
		assertEquals(200, account.getBalance());
	}

	@Test
	public void testCredit() throws InvalidAmountException {
		account.deposit(100);
		assertEquals(100, account.getBalance());
		account.deposit(100);
		assertEquals(200, account.getBalance());
	}

	@Test
	public void testDebit() throws NotEnoughMoneyException, InvalidAmountException {
		account.deposit(100);
		account.withdraw(30);
		assertEquals(70, account.getBalance());
		account.withdraw(20);
		assertEquals(50, account.getBalance());
	}

}
