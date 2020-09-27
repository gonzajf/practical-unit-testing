package practicalUnitTesting.chapter6;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.time.LocalTime;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class HelloRedesignedTest {

	private HelloRedesigned hello;
	private TimeProvider timeProvider;

	@Before
	public void setUp() {
		timeProvider = mock(TimeProvider.class);
		hello = new HelloRedesigned(timeProvider);
	}

	private static final Object[] morningHours() {
		return new Object[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	}

	@Test
	@Parameters(method = "morningHours")
	public void shouldSayGoodMorningInTheMorning(int morningHour) {
		when(timeProvider.getCurrentTime()).thenReturn(LocalTime.of(morningHour, 0));
		assertEquals("Good Morning!", hello.sayHello());
	}
	
	private static final Object[] afternoonHours() {
		return new Object[] {12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};
	}

	@Test
	@Parameters(method = "afternoonHours")
	public void shouldSayGoodAfternoonInTheAfternoon(int morningHour) {
		when(timeProvider.getCurrentTime()).thenReturn(LocalTime.of(morningHour, 0));
		assertEquals("Good Afternoon!", hello.sayHello());
	}
}