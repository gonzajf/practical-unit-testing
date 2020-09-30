package practicalUnitTesting.chapter7;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class MySutRedesignedTest {

	@Test
	public void testMyMethod() {

		MyCollaborator collaborator = mock(MyCollaborator.class);
		MySutRedesigned sut = new MySutRedesigned(collaborator);

		when(collaborator.doSomething()).thenReturn("hello");

		assertEquals("hello", sut.myMethod());
		verify(collaborator).doSomething();
	}
}