package javaBasics;

public class Returning_Array {

	public static void main(String[] args) {
		
		String [] array = ReturnArray();
		for (int i = 0; i < array.length-1; i++) {
			System.out.println("Print all elements of array: " + array[i]);
			
		}

	}

	public static String[] ReturnArray() {
		String [] array = {"YUGO", "PEUGEOT", "FORD", "SKODA", "HONDA", "FIAT"};
		return array;
	}

}
