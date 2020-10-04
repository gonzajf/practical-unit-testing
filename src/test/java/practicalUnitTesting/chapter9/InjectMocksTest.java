package practicalUnitTesting.chapter9;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class InjectMocksTest {

	@Mock
	private Collaborator collaborator;
	
	@InjectMocks
	private SUT sut = new SUT();

	@Test
	public void shouldReturnABC() {
		when(collaborator.doSth()).thenReturn("abc");
		assertEquals("abc", sut.useCollaborator());
	}
}