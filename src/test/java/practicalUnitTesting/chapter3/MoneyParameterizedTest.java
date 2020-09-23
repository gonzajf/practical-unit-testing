package practicalUnitTesting.chapter3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MoneyParameterizedTest {

	@ParameterizedTest
	@MethodSource
	public void constructorShouldSetAmountAndCurrency(int amount, String currency) {
		Money money = new Money(amount, currency);
		assertEquals(amount, money.getAmount());
		assertEquals(currency, money.getCurrency());
	}

	private static final Object[] constructorShouldSetAmountAndCurrency() {
		return new Object[] { new Object[] { 10, "USD" }, new Object[] { 20, "EUR" } };
	}
}
