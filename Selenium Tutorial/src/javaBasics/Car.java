package javaBasics;

public class Car {
	
	private String model;
    int gear;
    int highestSpeed;
    private String color;
    private int make;
    boolean leftHandDrive;
    String transmission;
    int tyres;
    int doors;
    
    public Car(String sModel, int iMake, String sColor) {
    	
    	model = sModel;
    	make = iMake;
    	color = sColor;
    }
    
    public Car() {
    	
    	model = "Fabia";
    	make = 2019;
    	color = "white";
    }
    
    public void DisplayCharacterstics() {
    	
    	System.out.println("Model of car is: " + model);
    	System.out.println("Number of gears in the car: " +  gear);
        System.out.println("Max speed of the car: " +  highestSpeed);
        System.out.println("Color of the car: " +  color);
        System.out.println("Make of the car: " +  make);
        System.out.println("Transmission of the car: " +  transmission);
    }

}
