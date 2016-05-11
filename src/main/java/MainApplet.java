package main.java;

import processing.core.PApplet;

/**
* This class is for sketching outcome using Processing
* You can do major UI control and some visualization in this class.  
*/
@SuppressWarnings("serial")
public class MainApplet extends PApplet{
	private String path = "main/resources/";
	private String file1 = "starwars-episode-1-interactions.json";
	private String file2 = "starwars-episode-2-interactions.json";
	private String file3 = "starwars-episode-3-interactions.json";
	private String file4 = "starwars-episode-4-interactions.json";
	private String file5 = "starwars-episode-5-interactions.json";
	private String file6 = "starwars-episode-6-interactions.json";
	private String file7 = "starwars-episode-7-interactions.json";
	private String nowfile = file1;
	JSONObject data;
	JSONArray nodes, links;
	private ArrayList<Character> characters;
	private Network net;
	private float x, y;
	private int n; //nodes' row
	private int m; //nodes' column
	private boolean isHolding = false; // if mouse has dragged a character
	private int nodeOnCircle; // node that are on the circle
	private ArrayList<Character> charactersOnCircle;
	private Character holdingNode; // character that been dragged by mouse
	private String epi="STAR WARS 1";
	
	private final static int width = 1200, height = 650;
	
	public void setup() {

		size(width, height);
		characters = new ArrayList<Character>();
		charactersOnCircle = new ArrayList<Character>();
		net = new Network(this);
		smooth();
		loadData();
		n = 0; // initialize row and column value
		m = 0;
		nodeOnCircle = 0; // clean to 0 whenever setup
	}

	public void draw() {
		background(255);
		net.display();
		for(Character character: characters){
			character.display();
		}
		//showing name when mouse moves on
		if(!isHolding){
			for(Character character: characters){
				if(sq(mouseX-character.x)+sq(mouseY-character.y)<900){
					character.showName();
					character.radius = 40;  //when mouse move on node, node become bigger
				} else {
					character.radius = 30;  //when mouse move away, node back to the initial size
				}
			}
		}
		fill(166, 255, 0);
		rect(1040, 100, 120, 50);  // button "CLEAR"
		rect(1040, 200, 120, 50);  // button "ADD ALL"
		fill(255);
		textSize(20);
		text("CLEAR", 1070, 130);
		text("ADD ALL", 1055, 230);
		
		//episode text
		fill(255, 102, 102);
		textSize(50);
		text(epi,450, 50);
				
		noFill();   ///
		connect();   ////
	}
	public void connect(){
		//System.out.println(charactersOnCircle);
		for(Character character1: charactersOnCircle){
			character1.showName();//show character name on the circle
			for(Character character2: charactersOnCircle){
				for(Character character: character1.targets){
					if(character.equals(character2)){
						strokeWeight(character1.targets_value.get(character));
						line(character1.x,character1.y,character2.x,character2.y);
						stroke(126);
						//strokeWeight(1);
					}
				}
				//System.out.println("1->2: "+character1+" -> "+character2);
			}
		}
	}
	private void loadData(){

	}

}
