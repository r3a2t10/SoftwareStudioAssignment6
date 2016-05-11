package main.java;

import processing.core.PApplet;

/**
* This class is used for the visualization of the network.
* Depending on your implementation, you might not need to use this class or create a class on your own.
* I used the class to draw the circle and re-arrange nodes and links.
* You will need to declare other variables.
*/
public class Network {
	
	private PApplet parent;

	public Network(PApplet parent){

		this.parent = parent;
		
	}

	public void display(){
		this.parent.background(255);
		this.parent.stroke(102, 255, 51);
		this.parent.noFill();
		this.parent.ellipse(700,350,400,400);
	}
	
}
