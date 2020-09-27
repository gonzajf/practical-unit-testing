package practicalUnitTesting.chapter6;

import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeoutTest {

	@Rule
	public Timeout globalTimeout = new Timeout(20, TimeUnit.MILLISECONDS);

//	@Test
//	public void willFail() throws InterruptedException {
//		Thread.sleep(100);
//	}

	@Test
	public void willPass() throws InterruptedException {
		Thread.sleep(10);
	}

}
