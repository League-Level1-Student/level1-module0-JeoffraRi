package _01_methods._1_houses;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class HousesRunner {
	
	public static final Color BEIGE = new Color(207, 192, 149);
	public static final Color LIGHTBEIGE = new Color(245, 236, 211);
	public static final Color DARKBEIGE = new Color(107, 100, 81);
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.setWindowColor(10,10,10);
		int height = 0;
		int houseX = 5;
		int houseY = 800;
		rob.setX(houseX);
		rob.setY(houseY);
		// Here we call the run() method from the Houses class
		// Do not add any more code here!
		//for (int a = 0; a < 10; a++) {
			  String size = JOptionPane.showInputDialog(null, "What size should the houses be?\n (large, medium, small, skyscraper)");
        String color = JOptionPane.showInputDialog(null, "What color should the houses be?\n (light beige, beige, dark beige)");
        for (int i=0; i<20; i++) {
       drawColorHouse(rob, size, color);
        }
	}

	//}

	public static void drawFlatHouse(Robot rob, int height) {
		Houses houseBuilder = new Houses();
		houseBuilder.run();
		// 1. Have a robot start on the left side of the window near the bottom.
   
		rob.penDown();
		rob.setSpeed(58);
		rob.setPenWidth(10);
		// 2. Draw a flat-topped house of height 100 with grass after it (see picture).
		rob.move(height);
		rob.turn(45);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(45);
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(33, 77, 0);
		rob.move(100);
		rob.turn(-90);

      
	}
	public static void drawFlatHouse(Robot rob, String height) {
		if (height.equalsIgnoreCase("small")) {
			drawFlatHouse(rob, 125);
		}else if (height.equalsIgnoreCase("medium")) {
			drawFlatHouse(rob, 250);	
		}else if (height.equalsIgnoreCase("large")) {
			drawFlatHouse(rob, 500);
		}else if (height.equalsIgnoreCase("skyscraper")) {
			drawFlatHouse(rob, 1000);
		}
	}
	public static void drawColorHouse(Robot rob, String height, String color) {
		if (color.equalsIgnoreCase("light beige")) {
			rob.setPenColor(LIGHTBEIGE);
			drawFlatHouse(rob, height);
		}else if (color.equalsIgnoreCase("beige")) {
			rob.setPenColor(BEIGE);
			drawFlatHouse(rob, height);
		}else if (color.equalsIgnoreCase("dark beige")) {
			rob.setPenColor(DARKBEIGE);
			drawFlatHouse(rob, height);
			;
		}
	}
	
        }


