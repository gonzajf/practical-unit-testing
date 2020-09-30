package practicalUnitTesting.chapter7;

public class MyPartialSut {

	public String myMethod() {
		MyCollaborator collaborator = createCollaborator();
		return collaborator.doSomething();
	}

	// method extracted to facilitate testing
	protected MyCollaborator createCollaborator() {
		return new MyCollaborator();
	}
}
