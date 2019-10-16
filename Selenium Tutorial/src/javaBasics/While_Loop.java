package javaBasics;

public class While_Loop {

	public static void main(String[] args) {
		
		int i = 0;
		
		while(i < 30) {
			
			i = i + 5;
			
			System.out.println("Count is ==> " +i);
		}
		
		System.out.println("<=== NEXT COUNT ===>");
		
		int iOnce = 30;
		
		while(iOnce < 30) {
			
			iOnce = iOnce + 5;
			
			System.out.println("Count is ==> " +iOnce);
		}

	}

}
