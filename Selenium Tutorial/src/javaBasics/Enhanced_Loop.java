package javaBasics;

public class Enhanced_Loop {

	public static void main(String[] args) {
		
		String days[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		
		for (String dayName : days) {
			System.out.println("Day ==> " + dayName);
			
		}
		
		System.out.println("<=== NEXT ===>");
		
		for (int i = 0; i < days.length; i++) {
			System.out.println("Day ==> " + days[i]);
			
		}

	}

}
