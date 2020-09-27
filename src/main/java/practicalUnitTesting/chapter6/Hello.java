package practicalUnitTesting.chapter6;

import java.time.LocalTime;

public class Hello {

	public String sayHello() {
		LocalTime current = LocalTime.now();
		if (current.isBefore(LocalTime.NOON)) {
			return "Good Morning!";
		} else {
			return "Good Afternoon!";
		}
	}
}