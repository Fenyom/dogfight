package jpu2016.dogfight.view;

import jpu2016.dogfight.model.Imobile;
import jpu2016.dogfight.gameframe.IGraphicsBuilder;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import jpu2016.dogfight.model.IDogfightModel;

public class GraphicsBuilder {
	private IDogfightModel IDogfightModel;
	private BufferedImage BufferedImage;
	
	public GraphicsBuilder(IDogfightModel DogfightModel) {
		this.IDogfightModel = DogfightModel;
	}
	
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {
		
	}
	
	private void buildEmptySky() {
		
	}
	
	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer) {
		
	}
	
	public int getGlobalWidth() {
		
	}
	
	public int getGlobalHeight() {
		
	}
}
