package javaBasics;

public class branching {
	// break statement
	public void breakStatement() {
		for(int i = 1; i <= 10; i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("End of the loop by break.");
	}
	
	
	// continue statement
	public void continueStatement() {
		for(int i = 0; i <= 10 ; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
	}
	
	// return statement
	public void returnStatement() {
		boolean t = true;
		System.out.println("Before return statement.");
		if(t) {
			return;
		}
		System.out.println("After return, this does not execute.");
	}
	
}
