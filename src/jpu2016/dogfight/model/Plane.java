package jpu2016.dogfight.model;

import java.awt.Dimension;
import javax.swing.text.Position;

public class Plane extends Mobile {
	
	private static int SPEED = 2;
	private static int WIDTH = 100;
	private static int HEIGHT = 30 ;
	private static int player;
	private static Position position;
	
	public Plane(Direction direction, Dimension dimension, String image) {
		super(direction,position,dimension,SPEED,image);
		// TODO Auto-generated constructor stub
	}

	
	public boolean isPlayer(int player){
		return false;
		
	}
	
	public boolean hit(){
		return true;
		
	}
	

}
