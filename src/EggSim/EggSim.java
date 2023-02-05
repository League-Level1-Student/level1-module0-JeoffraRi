package EggSim;

import processing.core.PApplet;
import processing.core.PImage;

public class EggSim extends PApplet {
    static final int WIDTH = 1920;
    static final int HEIGHT = 945;
    int eggwhite = 300;
    int widthwhite = 160;
    int widthyolk = 55;
    int opacity = 20;
    int widthpan = 920;
    int handlelength = 900;
    int handlewidth = 120;
    int eggY = 0;
    int eggSpeed = 0;

    boolean gameStarted = false;
    PImage startScreen;
    @Override
    
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	startScreen = loadImage("./EggSim/eggsim.png");
    	startScreen.resize(1200, 945);
    }

    @Override
    public void draw() {	
    	background(255,255,255);
    	if (gameStarted==true) {
    	eggY+=eggSpeed;
    	eggSpeed++;
    	}
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
    	ellipse(960, eggY, widthwhite+20, widthwhite);
    	//egg yolk \/
    	noStroke();
    	fill(255, 200, 0);
    	ellipse(960, eggY, widthyolk, widthyolk);
    	if (!gameStarted) {
    		//945/2 = 472
    		//1920/2 = 960 
    		eggY = 472;
    		background(0,0);
    		image(startScreen, 350,0);
    		
    	}
    	
    }
    public void mousePressed() {
    	gameStarted=true;
    	eggSpeed-=40;
    	opacity+=20;
    }

    static public void main(String[] args) {
        PApplet.main(EggSim.class.getName());
    }
}
