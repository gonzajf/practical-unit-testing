package practicalUnitTesting.chapter6;

import java.time.LocalTime;

public interface TimeProvider {

	default LocalTime getCurrentTime() {
		return LocalTime.now();
	}
}