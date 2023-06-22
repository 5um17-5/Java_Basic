package javaBasics;

import java.util.Scanner;

public class javaInput {
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Enter your height: ");
		float height = sc.nextFloat();
		System.out.println("Your name is "+ name + ". You are " + age + " years old." + " Your height is "+ height + " feet.");
		sc.close();
	}
}
