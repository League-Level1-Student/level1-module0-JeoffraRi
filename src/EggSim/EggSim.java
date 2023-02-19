package EggSim;

import processing.core.PApplet;
import processing.core.PImage;

public class EggSim extends PApplet {
    static final int WIDTH = 1000; // 1920 originally
    static final int HEIGHT = 600; // 945 originally
    int eggwhite = 300;
    int widthwhite = 160;
    int widthyolk = 55;
    int opacity = 20;
    int widthpan = 920;
    int handlelength = 900;
    int handlewidth = 120;
    int score = 0;
    int jumps = 0;
    float eggY = 0;
    float eggSpeed = 0;
    float grav = 0.2f;

    boolean gameStarted = false;
    PImage startScreen;
    PImage bacon;
    PImage gameover1;
    PImage gameover2;
    @Override
    
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	startScreen = loadImage("./EggSim/eggsim.png");
    	float ssRatio = 1699/1281;
    	
    	if (WIDTH>HEIGHT) {
    		System.out.println((int) (HEIGHT*ssRatio));
    		startScreen.resize((int) (HEIGHT*ssRatio), HEIGHT);
    	} else {
    		startScreen.resize(WIDTH, (int) (WIDTH/ssRatio));
    	}
    	
    	bacon = loadImage("./EggSim/baconpiece.png"); 
    	bacon.resize(400, 400);
    	
    	gameover1 = loadImage("./EggSim/gameover1.png");
    	gameover1.resize(1200, 945);
    	
    	gameover2 = loadImage("./EggSim/gameover2.png");
    	gameover2.resize(1200, 945);
    }

    @Override
    public void draw() {	
    	background(255,255,255);
    	if (gameStarted==true) {
    	eggY+=eggSpeed;
    	eggSpeed+=grav;
    	}
    	if (opacity>=400) {
    		score++;
    		opacity=20;
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
    	fill(0,0,0);
    	textSize(40);
    	text("Score: "+score+"", 10,40);
    	text("Jumps: "+jumps+"", 10,90);
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
    	eggSpeed=-10;
    	opacity+=100;
    	jumps+=1;
    }
    
    public void keyPressed() {
    	gameStarted=true;
    	eggSpeed=-10;
    	opacity+=100;
    	jumps+=1;
    }

    static public void main(String[] args) {
        PApplet.main(EggSim.class.getName());
    }
}
