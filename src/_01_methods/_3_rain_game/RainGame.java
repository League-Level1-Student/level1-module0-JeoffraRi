package _01_methods._3_rain_game;

import java.util.Random;

import javax.swing.JOptionPane;

import processing.core.PApplet;
import processing.core.PImage;

/*
//Goal: Make a game where the user has to catch rain drops in a bucket!
//
//In the setup() method:
//✅1. If you are using an image for the bucket, load it and resize it here.
//   A bucket image, bucket.png, has been provided if you want to use it.
//   bucket = loadImage("images/bucket.png");
//   bucket.resize(100, 100);  // you can choose values other than 100, 100
//
//In the draw() method:
//✅2. Set a background color
//
 //✅3. Draw a raindrop (ellipse) at the top of the screen
 // 
 //✅4. Make the rain fall down the screen.
 //    Hint: make a variable for the raindrop's Y position and change it after
//   you draw the raindrop.
//
//5. When the rain falls off the bottom of the canvas, start a new rain drop
//   falling from the top.
//   Each new drop should start at a random position (X position) at the top.
//   Hint: This code will get a random number between 0 and the window width.
//   int randomNumber = (int)random(width);
//
//6. Draw a bucket (rectangle or image) at the bottom of the screen.
//   The bucket's width needs to be stored in the bucketWidth variable.
//
//7. Make the bucket move side-to-side with the mouse. Hint: use mouseX
//
//8. When the rain drop has fallen to the bucket, call the checkCatch() method
//   to see if the rain drop is in the bucket.
//
//9. Show the current score on the screen using the code below.
//   Change the color if it does not show up on your background.
//   fill(0, 0, 0);
//   textSize(16);
//   text("Score: " + score, 20, 20);
 */
public class RainGame extends PApplet {
	static final int WIDTH = 600;
	static final int HEIGHT = 600;
	int score = 0;
	int bucketWidth = 180;
	int bucketHeight;
	int rainY = 0;
	int rainX = 350;
	int livez = 3;
	PImage hopper;
	PImage corn;
	PImage backdrop;
	PImage start;
	int y;
	int x;
	Random ran = new Random();

	// Sets the size of your canvas
	@Override
	public void settings() {
		size(700, 700);
	}

	@Override
	public void setup() {
		start = loadImage("startscreen.png");
		hopper = loadImage("hopper.png");
		corn = loadImage("corn.png");
		backdrop = loadImage("backdrop.png");
		corn.resize(25, 41);
		hopper.resize(180, 70);
		backdrop.resize(700, 700);
		start.resize(700, 700);
	}

	@Override
	public void draw() {
		if (livez==0) {
			drawGameOverScene();
		} else if (livez > 0) {
			drawGameScene();
		}
	}

	void drawGameOverScene() {
		background(0, 0, 0);
		fill(255,255,255);
		text("game over, boi", 260,260);
	}

	void drawGameScene() {
		background(250, 250, 250);
		image(start, 0, 0);
		// image(backdrop, 0, 0);
		image(corn, rainX, rainY);
		image(hopper, mouseX - 100, 450);
		fill(250, 250, 250);
		textSize(20);
		text("Score: " + score, 10, 20);
		fill(250, 0, 0);
		textSize(20);
		text("Lives: " + livez, 10, 50);
		rainY = rainY + 15 ;
		if (rainY > 450) {
			checkCatch(rainX);
		}

		if (rainY > 700) {
			// rainX = ;
			rainY = -10;
			Random geb = new Random();
			rainX = geb.nextInt(700);
		}

	}

	static public void main(String[] args) {
		PApplet.main(RainGame.class.getName());
	}

	/*********************** DO NOT MODIFY THE CODE BELOW ********************/

	void checkCatch(int x) {
		if (x > mouseX - 100 && x < mouseX - 100 + bucketWidth) {
			score++;
			rainY = -10;
			Random geb = new Random();
			rainX = geb.nextInt(700);
		} else if (score > 0) {
			livez--;
		}
		println("Your score is now: " + score);
	}
}
