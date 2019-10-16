package javaBasics;

public class IfThenElseIf_Statement {

	public static void main(String[] args) {
		
		String day = "Friday";
		int number = 5;
		
		if (day.equals("Saturday")) {
			System.out.println("Today is Saturday !!!");
		}else if (day.equals("Sunday")) {
			System.out.println("Today is Sunday !!!");
		}else {
			System.out.println("Today is Weekday !!!");
		}
		
		if(number == 6) {
			System.out.println("Today is Saturday !!!");
		}else if(number == 7){
			System.out.println("Today is Sunday !!!");
		}else {
			System.out.println("Today is Weekday !!!");
		}

	}

}
