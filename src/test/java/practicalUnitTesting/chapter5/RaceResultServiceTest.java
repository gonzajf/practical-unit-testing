package practicalUnitTesting.chapter5;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.never;

import org.junit.Test;

import practicalUnitTesting.chapter5.tdd.Client;
import practicalUnitTesting.chapter5.tdd.Message;
import practicalUnitTesting.chapter5.tdd.RaceResultsService;

public class RaceResultServiceTest {

	private RaceResultsService raceResults = new RaceResultsService();
	private Message message = mock(Message.class);
	private Client clientA = mock(Client.class, "clientA");
	private Client clientB = mock(Client.class, "clientB");

	@Test
	public void notSubscribedClientShouldNotReceiveMessage() {

		raceResults.send(message);

		verify(clientA, never()).receive(message);
		verify(clientB, never()).receive(message);
	}

	@Test
	public void subscribedClientShouldReceiveMessage() {

		raceResults.addSubscriber(clientA);
		raceResults.send(message);

		verify(clientA).receive(message);
	}

	@Test
	public void messageShouldBeSentToAllSubscribedClients() {

		raceResults.addSubscriber(clientA);
		raceResults.addSubscriber(clientB);
		raceResults.send(message);

		verify(clientA).receive(message);
		verify(clientB).receive(message);
	}

	@Test
	public void shouldSendOnlyOneMessageToMultiSubscriber() {

		raceResults.addSubscriber(clientA);
		raceResults.addSubscriber(clientA);
		raceResults.send(message);

		verify(clientA).receive(message);
	}

	@Test
	public void unsubscribedClientShouldNotReceiveMessages() {
		
		raceResults.addSubscriber(clientA);
		raceResults.removeSubscriber(clientA);
		raceResults.send(message);
		
		verify(clientA, never()).receive(message);
	}
}