package practicalUnitTesting.chapter9;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class BoilerplateCodeTest {

	private Collaborator collaborator;
	private SUT sut;

	@Before
	public void setUp() {
		sut = new SUT();
		collaborator = Mockito.mock(Collaborator.class);
		sut.setCollaborator(collaborator);
	}

	@Test
	public void shouldReturnABC() {
		when(collaborator.doSth()).thenReturn("abc");
		assertEquals("abc", sut.useCollaborator());
	}
}
