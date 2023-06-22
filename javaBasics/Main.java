package javaBasics;

public class Main {
	public static void main(String[] args) {
		// local variable
		LocalVariable localVariable = new LocalVariable();
		localVariable.EmployeeAge();
		
		System.out.println();
	
		// instance variable
		instanceVariable marks = new instanceVariable();
		marks.engMarks = 50;
		marks.mathMarks = 80;
		marks.phyMarks = 90;
		System.out.println("Marks for marks object:");
		System.out.println(marks.engMarks);
		System.out.println(marks.mathMarks);
		System.out.println(marks.phyMarks);
		
		System.out.println();
		
		// static variable
		staticVariable.salary = 10_000;
		System.out.println(staticVariable.name + "'s average salary: " + staticVariable.salary);
		
		System.out.println();
		
		//control flow if else
		var ifstate = new controlFlow();
		ifstate.ifstatement();
		
		// control flow 
		var ifelse = new controlFlow();
		ifelse.ifElse();
		
		// if else if statement
		var ifelseif = new controlFlow();
		ifelseif.ifElseif();
		
		// switch statement
		var switchstatement = new controlFlow();
		switchstatement.switchStatement();
		
		System.out.println();
		
		// for loop
		var forloop = new javaLoop();
		forloop.loop();
		
		// enhance loop
		var enhanceloop = new javaLoop();
		enhanceloop.enhanceLoop();
		
		// while loop
		var whileloop = new javaLoop();
		whileloop.whileLoop();
		
		// do while
		var dowhile = new javaLoop();
		dowhile.doWhile();
		
		System.out.println();
		
		// branching statement break;
		var breakstatement = new branching();
		breakstatement.breakStatement();
		
		// continue statement
		var continueStatement = new branching();
		continueStatement.continueStatement();
		
		// return statement
		var returnStatement = new branching();
		returnStatement.returnStatement();
		
		System.out.println();
		
		// Method
		Method.myMethod(); // static method can call without creating an object
		
		// Method returning values
		var sqr = new Method();
		System.out.println(sqr.square(20));
		
		// Method without argument
		var noArg = new Method();
		noArg.name();
		var withArg = new Method();
		withArg.name("Cat");
		
		// recursion
		var rec = new Method();
		System.out.println(rec.factorial(0)); // output 1
		System.out.println(rec.factorial(1)); // output 1
		System.out.println(rec.factorial(3)); // output 3 * (3-1) = 6
		
		System.out.println();
		
		// pass by value
		var passByValue = new passByValuePassByReference();
		passByValue.swap();
			System.out.println();
		// pass by reference value
		var referenceValue = new passByValuePassByReference();
		referenceValue.swap("Fish","Frog");
		
		System.out.println();
		
		// java input
		var giveInput = new javaInput();
		giveInput.input();
		
		System.out.println();
		System.out.println("--- Java Basic completed.");
				
	}
	
}
