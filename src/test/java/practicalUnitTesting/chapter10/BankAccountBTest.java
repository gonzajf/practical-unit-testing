package practicalUnitTesting.chapter10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import practicalUnitTesting.chapter9.BankAccount;

public class BankAccountBTest {

	private BankAccount account = new BankAccount();

	@Test
	public void shouldBeEmptyAfterCreation() {
		assertEquals(0, account.getBalance());
	}

	@Test
	public void shouldAllowToCreditAccount() throws InvalidAmountException {
		account.deposit(100);
		assertEquals(100, account.getBalance());
		account.deposit(100);
		assertEquals(200, account.getBalance());
	}

	@Test
	public void shouldAllowToDebitAccount() throws NotEnoughMoneyException, InvalidAmountException {
		account.deposit(100);
		account.withdraw(30);
		assertEquals(70, account.getBalance());
		account.withdraw(20);
		assertEquals(50, account.getBalance());
	}
	
	@Test(expected = NotEnoughMoneyException.class)
	public void shouldNotAllowToWithdrawFromEmptyAccount() throws NotEnoughMoneyException, InvalidAmountException {
		account.withdraw(100);
	}

	@Test(expected = InvalidAmountException.class)
	public void shouldNotAllowToUseNegativeAmountForWithdraw() throws NotEnoughMoneyException, InvalidAmountException {
		account.withdraw(-20);
	}

	@Test(expected = InvalidAmountException.class)
	public void shouldNotAllowToUseNegativeAmountForDeposit() throws InvalidAmountException {
		account.deposit(-20);
	}
}