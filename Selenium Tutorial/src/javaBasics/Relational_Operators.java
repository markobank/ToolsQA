package javaBasics;

public class Relational_Operators {

	public static void main(String[] args) {
		
		int first = 15;
		int second = 35;
		int third = 50;
		
		System.out.println("<<<<<< OPERATOR VECE >>>>>>");
		System.out.println("Petnest je vece od tridesetpet ==> " + (first > second));
		System.out.println("Pedeset je vece od petnest ==> " + (third > first));
		System.out.println("Tridesetpet je vece od pedeset ==> " + (second > third));
		
		System.out.println("<<<<<< OPERATOR VECE ILI JEDNAKO >>>>>>");
		System.out.println("Petnest je vece ili jednako od tridesetpet ==> " + (first >= second));
		System.out.println("Pedeset je vece ili jednako od petnest ==> " + (third >= first));
		System.out.println("Tridesetpet je vece ili jednako od pedeset ==> " + (second >= third));
		
		System.out.println("<<<<<< OPERATOR MANJE >>>>>>");
		System.out.println("Petnest je manje od tridesetpet ==> " + (first < second));
		System.out.println("Pedeset je manje od petnest ==> " + (third < first));
		System.out.println("Tridesetpet je manje od pedeset ==> " + (second < third));
		
		System.out.println("<<<<<< OPERATOR MANJE ILI JEDNAKO >>>>>>");
		System.out.println("Petnest je manje ili jednako od tridesetpet ==> " + (first <= second));
		System.out.println("Pedeset je manje ili jednako od petnest ==> " + (third <= first));
		System.out.println("Tridesetpet je manje ili jednako od pedeset ==> " + (second <= third));
		
		System.out.println("<<<<<< OPERATOR JEDNAKO >>>>>>");
		System.out.println("Petnest je jednako sa tridesetpet ==> " + (first == second));
		System.out.println("Pedeset i tridesetpet su jednako sa petnest ==> " + (third == first + second));
		
		System.out.println("<<<<<< OPERATOR NIJE JEDNAKO >>>>>>");
		System.out.println("Petnest je jednako sa tridesetpet ==> " + (first != second));
		System.out.println("Pedeset i tridesetpet su jednako sa petnest ==> " + (third != first + second));
		
		
		
		
		
	}

}
