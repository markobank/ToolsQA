package javaBasics;

public class Logical_Operators {

	public static void main(String[] args) {
		
		boolean first = true;
		boolean second = false;
		
		System.out.println("Proverava se da li su obe promenljive true :" + (first && second));
		System.out.println("Proverava se da li je makar jedna promenljive true :" + (first || second));
		System.out.println("Menja se stanje promenljive second u true :" + (!second));

	}

}
