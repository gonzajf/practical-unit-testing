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
}