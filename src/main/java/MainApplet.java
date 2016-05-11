package main.java;

import java.util.ArrayList;

import de.looksgood.ani.Ani;
import processing.core.PApplet;
import processing.data.JSONArray;
import processing.data.JSONObject;
import processing.event.KeyEvent;

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
		//=========================
		//episode text
		fill(255, 102, 102);
		textSize(50);
		text(epi,450, 50);
		//=========================
		//draw the connection
		noFill();
		connect();
	}
	public void connect(){
		//System.out.println(charactersOnCircle);
		for(Character character1: charactersOnCircle){
			character1.showName();//show character name on the circle
			for(Character character2: charactersOnCircle){
				for(Character character: character1.targets){
					if(character.equals(character2)){
						line(character1.x,character1.y,character2.x,character2.y);
						stroke(126);
						//strokeWeight(character1.targets_value.get(key));
					}
				}
				//System.out.println("1->2: "+character1+" -> "+character2);
			}
		}
	}
	public void keyPressed(KeyEvent e){  //changing episodes
		if(e.getKeyCode() == 49){
			nowfile = file1;
			epi="STAR WARS 1";
			setup();
		} else if(e.getKeyCode() == 50){
			nowfile = file2;
			epi="STAR WARS 2";
			setup();
		} else if(e.getKeyCode() == 51){
			nowfile = file3;
			epi="STAR WARS 3";
			setup();
		} else if(e.getKeyCode() == 52){
			nowfile = file4;
			epi="STAR WARS 4";
			setup();
		} else if(e.getKeyCode() == 53){
			nowfile = file5;
			epi="STAR WARS 5";
			setup();
		} else if(e.getKeyCode() == 54){
			nowfile = file6;
			epi="STAR WARS 6";
			setup();
		} else if(e.getKeyCode() == 55){
			nowfile = file7;
			epi="STAR WARS 7";
			setup();
		}
	}
	public void mouseDragged(){  //dragging character node
		if(!isHolding){
			for(Character character: characters){
				if(sq(mouseX-character.x)+sq(mouseY-character.y)<=900){
					holdingNode = character;
					isHolding = true;
					break;  //when holding one, then ignore others until mouseRealsed
				}
			}
		}
		if(isHolding){
			holdingNode.showName();
			holdingNode.radius = 40;
			holdingNode.x = mouseX;
			holdingNode.y = mouseY;
			if(sq(mouseX-700)+sq(mouseY-350)<=40000){
				strokeWeight(4);
			} else if(sq(mouseX-700)+sq(mouseY-350)>40000){
				strokeWeight(1);
			}
		}
	}
	public void mouseReleased(){
		if(isHolding){
			if(sq(mouseX-700)+sq(mouseY-350)<=40000){
				int notInyet = 1;
				int j = 1;
				for(Character character: charactersOnCircle){
					if(holdingNode == character){   ///if the node is already in circle
						notInyet = 0;  // do not add into charactersOnCircle again, and remain the value of nodeOnCircle
						character.x = 700+200*cos(2*PI*j/nodeOnCircle); // when MouseReleased, back to the position on circle
						character.y = 350+200*sin(2*PI*j/nodeOnCircle);
						break;
					}
					j++;
				}
				if(notInyet == 1){  // if the node has not on the circle, add it
					nodeOnCircle++;
					this.charactersOnCircle.add(holdingNode);
					int i = 1;
					for(Character character: charactersOnCircle){
						character.x = 700+200*cos(2*PI*i/nodeOnCircle);
						character.y = 350+200*sin(2*PI*i/nodeOnCircle);
						i++;
					}
					notInyet = 0;
				}
			} else {
				for(Character character: charactersOnCircle){  // to determine whether it is on the circle before mouseDragging
					if(holdingNode == character){
						nodeOnCircle--;
						this.charactersOnCircle.remove(holdingNode);
						break;
					}
				}
				int i = 1;
				for(Character character: charactersOnCircle){
					character.x = 700+200*cos(2*PI*i/nodeOnCircle);
					character.y = 350+200*sin(2*PI*i/nodeOnCircle);
					i++;
				}
				holdingNode.x = holdingNode.initX;
				holdingNode.y = holdingNode.initY;
			}
		}
		strokeWeight(1);
		isHolding = false;
	}
	public void mouseClicked(){
		if (overClear()) {
			for(Character character: characters){
				character.x = character.initX;
				character.y = character.initY;
			}
			this.charactersOnCircle.clear();
			//clear the charactersOnCircle List
		} else if(overAddAll()){
			int i = 1;
			nodeOnCircle = nodes.size();
			this.charactersOnCircle.clear();
			for(Character character: characters){
				this.charactersOnCircle.add(character);
				character.x = 700+200*cos(2*PI*i/nodeOnCircle);
				character.y = 350+200*sin(2*PI*i/nodeOnCircle);
				i++;
			}
		}
	}
	public boolean overClear()  {
		  if (mouseX >= 1040 && mouseX <= 1160 && 
		      mouseY >= 100 && mouseY <= 150) {
			  return true;
		  } else {
			  return false;
		  }
	}
	public boolean overAddAll()  {
		  if (mouseX >= 1040 && mouseX <= 1160 && 
		      mouseY >= 200 && mouseY <= 250) {
			  return true;
		  } else {
			  return false;
		  }
	}
	private void loadData(){
		data = loadJSONObject(path+nowfile);
		nodes = data.getJSONArray("nodes");
		links = data.getJSONArray("links");
		
		for(int i=0;i<nodes.size();i++){
			JSONObject ob = nodes.getJSONObject(i);
			String name = ob.getString("name");
			String colour = ob.getString("colour");
			y = 50+m*50;
			m++;
			x = 20+n*60;
			if(y>=600){
				n++;
				m = 0;
			}
			this.characters.add(new Character(this, name, colour, x, y));
			//boolean to consider connect or not
		}
		for(int i=0;i<links.size();i++){
			JSONObject ob = links.getJSONObject(i);
			int sorce = ob.getInt("source");
			int target = ob.getInt("target");
			int value = ob.getInt("value");
			Character tar = characters.get(target);
			characters.get(sorce).addTarget(tar, value);
		}
	}

}
