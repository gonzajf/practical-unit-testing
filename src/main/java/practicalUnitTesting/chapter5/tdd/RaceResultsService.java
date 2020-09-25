package practicalUnitTesting.chapter5.tdd;

import java.util.ArrayList;
import java.util.List;

public class RaceResultsService {
	
	private List<Client> clients = new ArrayList<>();

	public void addSubscriber(Client client) {
		clients.add(client);
	}

	public void send(Message message) {
		for(Client client : clients) {
			client.receive(message);
		}
	}
}