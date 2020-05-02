package jpu2016.dogfight.gameframe;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	private IGraphicsBuilder graphicsBuilder;
	
	public GamePanel(IGraphicsBuilder graphicBuilder) {
		this.graphicsBuilder = graphicsBuilder;
	}
	
	public void update(Observable observable) {
		
	}
	
	public void paintComponent(Graphics graphic) {
		
	}
}
