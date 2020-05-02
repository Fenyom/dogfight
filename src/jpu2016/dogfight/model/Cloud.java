package jpu2016.dogfight.model;



public class Cloud extends Mobile {
	

	private static int SPEED = 1;
	private static int WIDTH = 300;
	private static int HEIGHT = 150 ;
	private static String IMAGE = "cloud";
	private static Position position;

	public Cloud(Direction direction, Dimension dimension) {
		super(direction, position, dimension, SPEED, IMAGE);
		// TODO Auto-generated constructor stub
	}
	
	

}
