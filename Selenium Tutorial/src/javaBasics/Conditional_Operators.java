package javaBasics;

public class Conditional_Operators {

	public static void main(String[] args) {
		
		int first = 20;
		int second = 40;
		int third = 60;
		
		boolean bValue;
		int iValue;
		
		bValue = (third == first + second) ? true : false;
		System.out.println("The boolean value of variable bValue is: " + bValue);
		
		iValue = (third == first + second) ? 60 : 120;
		System.out.println("The int value of variable iValue is: " + iValue);
		
		iValue = (!(third == first + second)) ? 60 : 120;
		System.out.println("The int value of variable iValue is: " + iValue);
		
	}

}
