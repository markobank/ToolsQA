package javaBasics;

public class Passing_Array {

	public static void main(String[] args) {
		
		String [] array = {"YUGO", "PEUGEOT", "FORD", "SKODA", "HONDA", "FIAT"};
		
		Print_Array(array);
		
		

	}
	
	public static void Print_Array(String []array) {
		
		for (int i = 0; i <= array.length -1; i++) {
			
			System.out.println("Print all elements of array: " + array[i]);
		}
	}

}
