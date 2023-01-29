package EggSim;

import processing.core.PApplet;

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
    boolean gameStarted = false;
    int eggY = 0;
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
    	if (gameStarted==true) {
    	eggY+=5;
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
    		eggY = 472;
    		fill(0,0,0);
    		textSize(60);
    		text("Egg Simulator", 30, 472);
    		text("Click T     Start", 30, 540);
    		//egg white \/
        	fill(230, 230, 230);
        	noStroke();
        	ellipse(260, 520, widthwhite-100, widthwhite-105);
        	//egg yolk \/
        	noStroke();
        	fill(255, 200, 0);
        	ellipse(260, 520, widthyolk-30, widthyolk-30);
    	}
    	
    }
    public void mousePressed() {
    	gameStarted=true;
    	eggY-=40;
    	opacity+=20;
    }

    static public void main(String[] args) {
        PApplet.main(EggSim.class.getName());
    }
}
