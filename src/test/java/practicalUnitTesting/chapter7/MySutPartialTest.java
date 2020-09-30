package practicalUnitTesting.chapter7;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class MySutPartialTest {

	@Test
	public void testMyMethod() {
		
		MyPartialSut sut = spy(new MyPartialSut());
		MyCollaborator collaborator = mock(MyCollaborator.class);
		
		doReturn(collaborator).when(sut).createCollaborator();
		
		sut.myMethod();
		verify(collaborator).doSomething();
	}
}
