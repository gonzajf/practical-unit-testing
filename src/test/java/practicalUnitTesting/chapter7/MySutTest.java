package practicalUnitTesting.chapter7;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@PrepareForTest(MySut.class)
@RunWith(PowerMockRunner.class)
@PowerMockIgnore("jdk.internal.reflect.*")
public class MySutTest {

	@Test
	public void testMyMethod() throws Exception {
		
		MySut sut = new MySut();
		MyCollaborator collaborator = mock(MyCollaborator.class);
		
		PowerMockito.whenNew(MyCollaborator.class).withNoArguments().thenReturn(collaborator);
		Mockito.when(collaborator.doSomething()).thenReturn("hello");
		
		assertEquals("hello", sut.myMethod());
		verify(collaborator).doSomething();
	}
}
