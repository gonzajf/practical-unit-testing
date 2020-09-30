package practicalUnitTesting.chapter7;

public class MySutRedesigned {

	private final MyCollaborator collab;

	public MySutRedesigned(MyCollaborator collab) {
		this.collab = collab;
	}
	
	public String myMethod() {
		return collab.doSomething();
	}
}