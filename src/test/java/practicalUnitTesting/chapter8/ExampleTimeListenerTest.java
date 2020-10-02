package practicalUnitTesting.chapter8;

import org.junit.Rule;
import org.junit.Test;

public class ExampleTimeListenerTest {

	@Rule
	public TimeTestListener timeListener = new TimeTestListener();

	@Test
	public void tenMillis() throws InterruptedException {
		Thread.sleep(10);
	}

	@Test
	public void twentyMillis() throws InterruptedException {
		Thread.sleep(20);
	}
}