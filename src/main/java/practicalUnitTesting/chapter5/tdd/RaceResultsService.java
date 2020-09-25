package practicalUnitTesting.chapter5.tdd;

import java.util.HashSet;
import java.util.Set;

public class RaceResultsService {

	private Set<Client> clients = new HashSet<>();

	public void addSubscriber(Client client) {
		clients.add(client);
	}

	public void send(Message message) {
		for (Client client : clients) {
			client.receive(message);
		}
	}

	public void removeSubscriber(Client client) {
		clients.remove(client);
	}
}