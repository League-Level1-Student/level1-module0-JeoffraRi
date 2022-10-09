package _01_methods._1_houses;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class HousesRunner {

	public static void main(String[] args) {
		//Here we call the run() method from the Houses class
		//Do not add any more code here!
		for(int a=0; a<10; a++) {
			drawFlatHouse();
		}

	}
	
public static void drawFlatHouse() { 
		Houses houseBuilder = new Houses();
		houseBuilder.run();
		//1. Have a robot start on the left side of the window near the bottom. 
		Robot rob = new Robot();
		int houseX = 100;
		int houseY = 450;
		rob.setX(houseX);
		rob.setY(houseY);
		rob.penDown();
		rob.setSpeed(100);
		rob.setPenColor(219, 198, 127);
		rob.setPenWidth(10);
	//2. Draw a flat-topped house of height 100 with grass after it (see picture). 
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(-90);
		rob.setPenColor(33, 77, 0);
		rob.move(100);
		rob.turn(90);
	
	//3. Extract the piece of code that draws the house into a method. Draw 10 houses. 
		
		//4. Change the method to take (int height) as a parameter. Draw 9 houses of different heights 
			
		//5. Make the method take a String instead of an int. 
			
		      //“small”                 60 
				
		      //“medium”             120 
				
		      //“large”                 250 
				
		//6. Make the method take a color as well as a height. The houses are drawn in that color. 
			
		//[optional] Set the scene to night by setting the background to black 
			
		//7. Give the houses peaked roofs 
			
		//8. Extract that roof code into a method “drawPointyRoof” and create a new method: “drawFlatRoof”. 
			
		//9. Make large houses have flat roofs
		
		}
}
