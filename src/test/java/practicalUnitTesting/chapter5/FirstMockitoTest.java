package practicalUnitTesting.chapter5;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class FirstMockitoTest {

	private Car myFerrari = mock(Car.class);

	@Test
	public void testIfCarIsACar() {
		assertTrue(myFerrari instanceof Car);
	}

	@Test
	public void testStubbing() {
		when(myFerrari.needsFuel()).thenReturn(true);
		assertTrue("after instructed test double should return what we want", myFerrari.needsFuel());
	}
}