package cs187.part1;

public class Assignments {
	public static void main(String[] args) {
		// Assignment of primitive types:
		int intA = 10;
		int intB = intA;
		
		System.out.println("intA = " + intA);
		System.out.println("intB = " + intB);
		
		// Assignment of reference types:
		String c1 = "Hello, World from c1";
		String c2 = "Hello, World from c2";
		
		c1 = c2;
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
	}
}
