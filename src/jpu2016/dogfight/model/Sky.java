package jpu2016.dogfight.model;

import java.awt.Image;

public class Sky implements IArea {
	
	protected Dimension dimension;
	protected Image image;

	public Dimension getDimension() {
		return dimension;
	}
	
	public Sky (Dimension dimension){
		
		this.dimension = dimension;
	}

	public Image getImage() {
		return image;
	}
	
}
