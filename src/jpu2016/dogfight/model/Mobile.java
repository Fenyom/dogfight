package jpu2016.dogfight.model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;

import javax.swing.text.Position;

public class Mobile implements IMobile {
	
	protected Dimension dimension;
	protected Direction direction;
	protected Position position ;
	protected Image image;
	private int speed;
	
	
	public  Mobile(Direction direction , Position position , Dimension dimension , int speed , String image){
		this.setDirection(direction) ;
		this.position = position ;
		this.dimension = dimension ;
		this.speed = speed ;
		this.images = new ArrayList<Image>() ;
	}

	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return direction;
	}

	@Override
	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub
		this.direction = direction;
	}

	@Override
	public Position getPosition() {
		return position;
	}

	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return dimension;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return this.dimension.getWidth() ;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return this.dimension.getHeight();
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		switch (this.getDirection()) {
		case UP : this.moveUp(); break;
		case DOWN : this.moveDown(); break;
		case LEFT : this.moveLeft(); break;
		case RIGHT : this.moveRight(); break;
	}	
	}
	
	public void moveRight() {
		Position pos = this.getPosition();
		pos.setX(pos.getX() + this.getSpeed());
	}
	
	public void moveUp() {
		Position pos = this.getPosition();
		pos.setY(pos.getY() - this.getSpeed());
	}
	public void moveDown() {
		Position pos = this.getPosition();
		pos.setY(pos.getY() + this.getSpeed());
}
	public void moveLeft() {
		Position pos = this.getPosition();
		pos.setX(pos.getX() - this.getSpeed());
}
	
	public Color getColor(){
		return new Color(255,255,255);;
		
	}
	
	

	@Override
	public void PlaceInArea(IArea area) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	public IDogfightModel getDogfightModel() {
		return  this.dogfightModel;
	
		
	}

	
	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setDogfightModel(DogfightModel dogfightModel) {
		// TODO Auto-generated method stub
		this.dogfightModel = dogfightModel;
	}

}
