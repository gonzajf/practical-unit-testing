package practicalUnitTesting.chapter5;

import static org.mockito.Mockito.*;

import org.junit.Test;

import practicalUnitTesting.chapter5.tdd.Client;
import practicalUnitTesting.chapter5.tdd.Message;
import practicalUnitTesting.chapter5.tdd.RaceResultsService;

public class RaceResultServiceTest {

	@Test
	public void subscribedClientShouldReceiveMessage() {
		RaceResultsService raceResults = new RaceResultsService();
		Client client = mock(Client.class);
		Message message = mock(Message.class);
		
		raceResults.addSubscriber(client);
		raceResults.send(message);
		
		verify(client).receive(message);
	}
}