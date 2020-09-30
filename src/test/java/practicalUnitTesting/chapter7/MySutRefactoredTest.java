package practicalUnitTesting.chapter7;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class MySutRefactoredTest {

	private MyCollaborator collaborator;

	class MyRefactoredSutSubclassed extends MyRefactoredSut {
		@Override
		protected MyCollaborator createCollaborator() {
			return collaborator;
		}
	}

	@Test
	public void testMyMethod() {
		
		MyRefactoredSut sut = new MyRefactoredSutSubclassed();
		collaborator = mock(MyCollaborator.class);
		
		when(collaborator.doSomething()).thenReturn("hello");
		
		assertEquals("hello", sut.myMethod());
		verify(collaborator).doSomething();
	}
}