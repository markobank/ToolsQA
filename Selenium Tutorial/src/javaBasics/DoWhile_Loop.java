package javaBasics;

public class DoWhile_Loop {

	public static void main(String[] args) {
		
		int i = 0;
		
		do {
			i = i + 5;
			System.out.println("Count is ==> "+ i);
		}while (i < 30);
		
		System.out.println("<=== NEXT COUNT ===>");
		
		int iOnce = 30;
		
		do {
			iOnce = iOnce + 5;
			System.out.println("Count is ==> "+ iOnce);
		}while(iOnce < 30);

	}

}
