package javaBasics;

public class Assignment_Operators {
	
	static int speed = 90;
	static int distance = 25;
	static int time = 15;
	static String name = "ToolsQA";
	static boolean isGood = true;

	public static void main(String[] args) {
		
	System.out.println("Value stored in the speed variable is: " + speed);
	System.out.println("Value stored in the distance variable is: " + distance);
	System.out.println("Value stored in the time variable is: " + time);
	System.out.println("Value stored in the name variable is: " + name);
	System.out.println("Value stored in the isGood variable is: " + isGood);
		
		
	speed = 150;
	time = distance;
	name = "ForumsQA";
	isGood = false;
	
	System.out.println("Value stored in the speed variable is: " + speed);
	System.out.println("Value stored in the time variable is: " + time);
	System.out.println("Value stored in the name variable is: " + name);
	System.out.println("Value stored in the isGood variable is: " + isGood);
	
	speed = distance = 0;
	
	System.out.println("Value stored in the speed variable is: " + speed);
	
	//Illegal
	
	//speed = "ToolsQA";
	//name = 16;
	//isGood = "ToolsQA"; 
	
	
	
	
		
		
		

	}

}
