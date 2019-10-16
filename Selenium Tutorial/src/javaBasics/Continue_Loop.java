package javaBasics;

public class Continue_Loop {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 5; i++) {
			if(i==4) {
				continue;
			}
			System.out.println("Count is ==> " +i);
			
		}
		
		System.out.println("<=== NEXT COUNT ===>");
		
		for (int i = 0; i <= 5; i++) {
			if (i==4) {
				System.out.println("Count is ==> " +i);	
			}
			continue;
			
		}

	}

}
