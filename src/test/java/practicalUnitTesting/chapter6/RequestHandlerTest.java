package practicalUnitTesting.chapter6;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;
import static com.googlecode.catchexception.CatchException.*;

import org.junit.Test;

public class RequestHandlerTest {

	@Test
	public void shouldThrowExceptions() throws InvalidRequestException {
	
		Request request = createInvalidRequest();
		RequestProcessor requestProcessor = mock(RequestProcessor.class);
		RequestHandler sut = new RequestHandler(requestProcessor);
		
		catchException(sut).handle(request);
		
		assertTrue("Should have thrown exception of InvalidRequestException class",
				caughtException() instanceof InvalidRequestException);
		verifyZeroInteractions(requestProcessor);
	}

	private Request createInvalidRequest() {
		return new Request();
	}

}
