package javaBasics;

public class For_Loop {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 5; i++) {
			System.out.println("Count is ==> " +i);
			
		}
		System.out.println("<=== NEXT COUNT ===>");
		
		for (int i = 5; i >= 0; i--) {
			System.out.println("Count is ==> " +i);
			
		}
		System.out.println("<=== NEXT COUNT ===>");
		
		for (int i = 0; i <= 5; i+=2) {
			System.out.println("Skip every one another  ==> " + i );	
		}

	}

}
