package practicalUnitTesting.chapter3;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private final List<Address> addresses;

	public Client() {
		this.addresses = new ArrayList<>();
	}
	
	public void addAddress(Address address) {
		addresses.add(address);
	}

	public List<Address> getAddresses() {
		return addresses;
	}
}