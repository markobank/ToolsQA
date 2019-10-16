package javaBasics;

public class ClassTestExercise {

	public static void main(String[] args) {
		
		Car Peugeot = new Car("206 SW", 2003, "gray");
		
		Car Skoda = new Car();
		
		Peugeot.doors = 5;
		Peugeot.gear = 5;
		Peugeot.highestSpeed = 191;
		Peugeot.leftHandDrive = true;
		Peugeot.transmission = "manual";
		Peugeot.tyres = 4;
		
		Peugeot.DisplayCharacterstics();
		
		Skoda.DisplayCharacterstics();

	}

}
