package practicalUnitTesting.chapter5.tdd;

public class RaceResultsService {
	
	private Client client;

	public void addSubscriber(Client client) {
		this.client = client;
	}

	public void send(Message message) {
		client.receive(message);
	}
}