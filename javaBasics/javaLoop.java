package javaBasics;

public class javaLoop {
	// for loop
	public void loop() {
		for(int i=1; i <= 5; i++) {
			System.out.println(i);
		}
	}
	
	// enhance loop for java
	public void enhanceLoop() {
		String array[] = {"Mango","Apple","Banana","Leeche"};
		for(String fruits: array) {
			System.out.println(fruits);
		}
	}
	
	
	// while loop
	public void whileLoop() {
		int x = 1;
		while(x < 5) {
			System.out.println("value of x is: "+ x);
			x++;
		}
	}
	
	//do-while
	public void doWhile() {
		int x = 1;
		do {
			System.out.println(x);
			x++;
		}while(x <= 3);
	}
	
	
}
