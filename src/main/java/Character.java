package main.java;

import java.util.ArrayList;
import java.util.HashMap;

import processing.core.PApplet;

/**
* This class is used to store states of the characters in the program.
* You will need to declare other variables depending on your implementation.
*/
public class Character {
	
	private MainApplet parent;
	private String name, colour;
	public float x, y, radius;
	public float initX, initY;  ///
	public ArrayList<Character> targets;
	public HashMap<Character, Integer> targets_value;

	public Character(MainApplet parent, String name, String colour, float x,float y){
		this.parent = parent;
		this.name = name;
		this.colour = colour;
		this.x = x;
		this.y = y;
		this.initX = x;
		this.initY = y;
		//this.charactersOnCircle = charactersOnCircle ;
		this.radius = 30;
		// Initialize the target list
		this.targets = new ArrayList<Character>();
		this.targets_value = new HashMap<Character, Integer>();
	}

	public void display(){
		//this.parent.background(255);
		//decode string he into RGB integer
		long thisCol=Long.decode(colour)+4278190080L;
		int useColour=(int)thisCol;
		
		this.parent.fill(useColour);
		this.parent.noStroke();//no ellipse stroke
		this.parent.ellipse(this.x, this.y, radius, radius);///
	}
	public void showName(){
		this.parent.fill(51, 51, 153);//fill the name color
		this.parent.textSize(15);
		this.parent.text(this.name, this.x, this.y);
	}
	public void addTarget(Character target, int value){
		this.targets.add(target);
		this.targets_value.put(target, value);
	}
	
	public ArrayList<Character> getTargets(){
		return this.targets;
	}
}
