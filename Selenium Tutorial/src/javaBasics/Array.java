package javaBasics;

public class Array {

	public static void main(String[] args) {
		
		String [] array = {"YUGO", "PEUGEOT", "FORD", "SKODA", "HONDA", "FIAT"};
		
		int arrayLenght = array.length;
		
		System.out.println("Length of the Array is ==> " + arrayLenght);
		
		String yugo = array[0];
		
		System.out.println("First element of array is: " + yugo);
		
		String fiat = array[arrayLenght-1];
		
		System.out.println("Last element of array is: " + fiat);
		
		for (int i = 0; i <= array.length-1; i++) {
			System.out.println("The value stored at position "+i+" in aMake array is ==> " + array[i]);
		}

	}

}
