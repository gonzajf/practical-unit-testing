package practicalUnitTesting.chapter7;

public class MySut {

	public String myMethod() {
		MyCollaborator collaborator = new MyCollaborator();
		return collaborator.doSomething();
	}
}