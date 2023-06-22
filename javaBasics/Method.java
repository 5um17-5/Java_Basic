package javaBasics;

public class Method {
	public static void myMethod() {
		System.out.println("Welcome to the future. This method is static method.");
	}
	
	public int square(int i) {
		return i * i;
	}
	
	private String type = "Dog";
	
	public void name() {
		System.out.println(type + " is an animal.");
	}
	
	// this is method overloading
	public void name(String name) {
		this.type = name;
		System.out.println(type + " is an animal.");
	}
	
	// method recursion
	public int factorial(int a) {
		if(a == 1 || a == 0) {
			return 1;
		}else {
			return a * factorial(a-1); // use factorial method inside same method
		}
	}
}
