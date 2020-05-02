package jpu2016.dogfight.model;


public class Plane extends Mobile {
	
	private static int SPEED = 2;
	private static int WIDTH = 100;
	private static int HEIGHT = 30 ;
	private static int player;
	private static Position position;
	
	public Plane(Direction direction, Dimension dimension, String image) {
		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, image);
		
		this.player = player;
	}

	
	public boolean isPlayer(int player){
		return player == this.player ;
		
	}
	
	public boolean hit(){
		this.getDogfightModel().removeMobile((IMobile) this);
		return true;
		
	}
	

}
