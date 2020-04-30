package jpu2016.dogfight.model;

import javax.swing.text.Position;

public class Plane extends Mobile {
	
	int SPEED = 2;
	int WIDTH = 100;
	int HEIGHT = 30 ;
	int player;
	
	public Plane(Direction direction, Position position, Dimension dimension, int speed, String image) {
		super(direction, position, dimension, speed, image);
		// TODO Auto-generated constructor stub
	}

	
	public boolean isPlayer(int player){
		return false;
		
	}
	
	public boolean hit(){
		return true;
		
	}
	

}
