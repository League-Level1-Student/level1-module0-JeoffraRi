package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird2 extends PApplet {
    static final int WIDTH = 1920;
    static final int HEIGHT = 945;
    int eggwhite = 300;
    int widthwhite = 300;
    int widthyolk = 105;
    int opacity = 20;
    int widthpan = 850;
    int handlelength = 800;
    int handlewidth = 100;
  
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	
    }

    @Override
    public void draw() {	
    	background(255,255,255);
    	opacity+=1;
    	//handle \/
    	fill(0,0,0);
    	noStroke();
    	rect(1200, HEIGHT/2-60, handlelength, handlewidth);
    	//skillet \/
    	fill(20,20,20);
    	stroke(0,0,0);
    	strokeWeight(20);
    	ellipse(WIDTH/2, HEIGHT/2, widthpan, widthpan);
    	//egg white \/
    	fill(255, 255, 255, opacity);
    	noStroke();
    	ellipse(mouseX, mouseY, widthwhite+40, widthwhite);
    	//egg yolk \/
    	noStroke();
    	fill(255, 200, 0);
    	ellipse(mouseX, mouseY, widthyolk, widthyolk);
    	
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird2.class.getName());
    }
}
