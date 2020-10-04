package practicalUnitTesting.chapter9;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class OneLinerStubbingTest {

	private Collaborator collaborator = 
				when(mock(Collaborator.class).doSth())
					.thenReturn("abc").getMock();
	
	private SUT sut;

	@Before
	public void setup() {
		sut = new SUT();
		sut.setCollaborator(collaborator);
	}

	@Test
	public void shouldReturnABC() {
		assertEquals("abc", sut.useCollaborator());
	}
}