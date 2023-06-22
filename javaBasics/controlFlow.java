package javaBasics;

public class controlFlow {
	
	boolean condition = true;
	
	public void ifstatement() {
		if(condition) {
			System.out.println("Condition is true.");
		}
	}
	
	public void ifElse() {
		condition = false;
		if(condition) {
			System.out.println("Condition is true.");
		}else {
			System.out.println("condition is false.");
		}
	}
	
	public void ifElseif() {
		int i = 10;
		if(i>10) {
			System.out.println("condition is greater than 10");
		}else if(i<10){
			System.out.println("condition is less than 10");
		}else {
			System.out.println("condition is equal to 10");
		}
	}
	
	public void switchStatement() {
		int age = 2;
		switch(age) {
		case 1: System.out.println("you are 1 year old");
			break;
		case 2: System.out.println("you are 2 year old");
			break;
		case 3: System.out.println("you are 3 years old");
			break;
		default:
			System.out.println("you are more than 3 years old");
		}
	}
		
}
