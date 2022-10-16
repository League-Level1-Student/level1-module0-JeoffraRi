package _01_methods._1_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class HousesRunner {

	public static void main(String[] args) {
		Robot rob = new Robot();
		int height = 0;
		int houseX = 5;
		int houseY = 800;
		rob.setX(houseX);
		rob.setY(houseY);
		// Here we call the run() method from the Houses class
		// Do not add any more code here!
		for (int a = 0; a < 10; a++) {
			Random ran = new Random();
			height = ran.nextInt(900);
			drawFlatHouse(rob, height);
		}

	}

	public static void drawFlatHouse(Robot rob, int height) {
		Houses houseBuilder = new Houses();
		houseBuilder.run();
		// 1. Have a robot start on the left side of the window near the bottom.

		rob.penDown();
		rob.setSpeed(58);
		rob.setPenColor(219, 198, 127);
		rob.setPenWidth(10);
		// 2. Draw a flat-topped house of height 100 with grass after it (see picture).
		rob.move(height);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(33, 77, 0);
		rob.move(100);
		rob.turn(-90);


	}
	public static void drawFlatHouse(Robot rob, String height) {
		if (height.equalsIgnoreCase("small")) {
			drawFlatHouse(rob, 60);
		}else if (height.equalsIgnoreCase("medium")) {
			drawFlatHouse(rob, 120);	
		}else if (height.equalsIgnoreCase("large")) {
			drawFlatHouse(rob, 250);
		}
	}
	public static void drawColorHouse(Robot rob, String height, String color) {
		if (color.equalsIgnoreCase("light beige")) {
			drawFlatHouse(rob, 60);
		}else if (color.equalsIgnoreCase("beige")) {
			drawFlatHouse(rob, 120);	
		}else if (color.equalsIgnoreCase("dark beige")) {
			drawFlatHouse(rob, 250);
		}
	}
}
