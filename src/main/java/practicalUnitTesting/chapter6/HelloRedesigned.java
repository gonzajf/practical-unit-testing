package practicalUnitTesting.chapter6;

import java.time.LocalTime;

public class HelloRedesigned {

	private TimeProvider timeProvider;

	public HelloRedesigned(TimeProvider timeProvider) {
		this.timeProvider = timeProvider;
	}

	public String sayHello() {
		LocalTime current = timeProvider.getCurrentTime();
		if (current.isBefore(LocalTime.NOON)) {
			return "Good Morning!";
		} else {
			return "Good Afternoon!";
		}
	}
}