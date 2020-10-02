package practicalUnitTesting.chapter8;

import java.util.HashMap;
import java.util.Map;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class TimeTestListener extends TestWatcher {

	private Map<String, Long> startTimes = new HashMap<>();

	@Override
	protected void starting(Description description) {
		startTimes.put(description.getMethodName(), System.currentTimeMillis());
	}

	@Override
	protected void finished(Description description) {
		long executionTime = System.currentTimeMillis() - startTimes.get(description.getMethodName());
		System.out.println(description.getMethodName() + ": " + executionTime);
	}
}