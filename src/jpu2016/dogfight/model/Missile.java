package jpu2016.dogfight.model;

import java.awt.Dimension;

import javax.swing.text.Position;

public class Missile extends Mobile {
	
	private static int SPEED = 4;
	private static int WIDTH = 30;
	private static int HEIGHT = 10 ;
	private static int MAX_DISTANCE_TRAVELED = 1400;
	private static String IMAGE = "Missile";
	private static int distance_traveled = 0 ;
	private static Position position;

	public Missile(Direction direction, Dimension dimension) {
		super(direction, position, dimension, SPEED, IMAGE);
		// TODO Auto-generated constructor stub
	}
	
	public int getWidthWithADirection(Direction direction){
		if (direction == Direction.UP || direction == Direction.DOWN) {
			return WIDTH;
		} else {
			return HEIGHT;
		}	
		
	}
	
	public int getHeightithADirection(Direction direction){
		if (direction == Direction.UP || direction == Direction.DOWN) {
			return HEIGHT;
		} else {
			return WIDTH;
		}
		
	}
	
	public void move(){
		this.distanceTraveled += this.getSpeed();
		if (this.distanceTraveled > MAX_DISTANCE_TRAVELED) {
			this.getDogfightModel().removeMobile((IMobile) this);
		}
	}

	public boolean isWeapon(){
		return true;
		
	}
}
