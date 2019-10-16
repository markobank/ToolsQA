package javaBasics;

public class Break_Loop {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			if(i==6) {
				break;
			}
			System.out.println("Count is ==> " +i);
		}
		System.out.println("End of loop !!!");

	}

}
