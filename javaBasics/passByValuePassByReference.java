package javaBasics;

public class passByValuePassByReference {
	private String animal1 = "Lion";
	private String animal2 = "Elephant";
	
	public void swap() {
		System.out.println("Before swaping, animal1 = "+ animal1 + " and animal2 = " + animal2);
		String tempAni = this.animal1;
		this.animal1 = animal2;
		this.animal2 = tempAni;
		System.out.println("After swaping, animial1 = "+ animal1 + " and animal2 = " + animal2);
	}
	
	public void swap(String ani1, String ani2) {
		this.animal1 = ani1;
		this.animal2 = ani2;
		System.out.println("Before swaping, animal1 = "+ animal1 + " and animal2 = " + animal2);
		String tempAni = this.animal1;
		this.animal1 = animal2;
		this.animal2 = tempAni;
		System.out.println("After swaping, animial1 = "+ animal1 + " and animal2 = " + animal2);
	}
}
