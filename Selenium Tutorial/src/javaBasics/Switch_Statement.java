package javaBasics;

public class Switch_Statement {

	public static void main(String[] args) {
		
		int number = 3;
		String day = "Wednesday";
		
		switch (number) {
		
		case 1:
			System.out.println("Today is Monday !!!");
			break;
		
		case 2:
			System.out.println("Today is Tuesday !!!");
			break;
		
		case 3:
			System.out.println("Today is Wednesday !!!");
			break;
		
		case 4:
			System.out.println("Today is Thursday !!!");
			break;
		
		case 5:
			System.out.println("Today is Friday !!!");
			break;
		
		case 6:
			System.out.println("Today is Saturday !!!");
			break;
		
		default:
			System.out.println("Today is Sunday !!!");
		}
		
		switch (day) {
		
		case "Monday":
			System.out.println("Today is Monday !!!");
			break;
		
		case "Tuesday":
			System.out.println("Today is Tuesday !!!");
			break;
		
		case "Wednesday":
			System.out.println("Today is Wednesday !!!");
			break;
		
		case "Thursday":
			System.out.println("Today is Thursday !!!");
			break;
		
		case "Friday":
			System.out.println("Today is Friday !!!");
			break;
		
		case "Saturday":
			System.out.println("Today is Saturday !!!");
			break;
		
		default:
			System.out.println("Today is Sunday !!!");
		}

	}

}
