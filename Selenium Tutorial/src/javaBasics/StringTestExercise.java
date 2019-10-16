package javaBasics;

public class StringTestExercise {

	public static void main(String[] args) {
		
		String popularTopic1 = "Selenium Automation Framework";
		String popularTopic2 = "Basic Java Tutorial";
		String space = " ";
		
		int length = popularTopic1.length();
		
		System.out.println("Popular Topic of ToolsQA: " +  popularTopic1);
		System.out.println("Length of the Popular Topic: " +  length);
		
		//Concatenating String
		
		System.out.println("First output");
		System.out.println(popularTopic1.concat(popularTopic2));
		
		System.out.println("Second output");
		System.out.println("Selenium Automation Framework".concat(popularTopic2));
		
		System.out.println("Third output");
		System.out.println("Selenium Automation Framework"+ "Basic Java Tutorial" );
		
		System.out.println("Fourth output");
		System.out.println("Selenium Automation Framework" + space + "Basic Java Tutorial" );
		
		//Various String Methods
		
		boolean compareResult = popularTopic1.equals(popularTopic2);
		System.out.println("Result of comparation of two Strings is: " + compareResult);
		
		char index = popularTopic1.charAt(2);
		System.out.println("The second character of popularTopic 1 is:  " + index);
		
		boolean containResult = popularTopic1.contains("Automation");
		System.out.println("The result of string Automation is contained in the String popularTopic1 is : " +containResult);
		
		int Index = popularTopic1.indexOf("Automation");
		System.out.println("The start index of the string Automation is : " + Index);
		
		String subString = popularTopic1.substring(Index);
		System.out.println("The sub string from the iIndex number is : " + subString);
		
		subString = popularTopic1.substring(8, 19);
		System.out.println("The sub string of Popular Topic 1 from index 8 to 19 is : " + subString);
		
		String lowerCase = popularTopic1.toLowerCase();
		System.out.println("The lower case of the Popular Topic 1 is : " + lowerCase);
		
		String [] split = popularTopic1.split("Automation");
		System.out.println("The first part of the array is : " + split[0]);
		System.out.println("The last part of the array is : " + split[1]);
		
		
		

	}

}
