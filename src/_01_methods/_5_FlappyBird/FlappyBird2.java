package _01_methods._5_FlappyBird;

import processing.core.PApplet;

public class FlappyBird2 extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    	background(255, 255, 255);
    	fill(255, 200, 0);
    	stroke(255, 100, 0);
    	ellipse(300, 300, 70, 70);
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird2.class.getName());
    }
}
