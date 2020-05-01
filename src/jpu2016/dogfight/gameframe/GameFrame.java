package jpu2016.dogfight.gameframe;

import javax.swing.JFrame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

public class GameFrame extends JFrame implements KeyListener{
	IEventPerformer performer;
	IGraphicsBuilder graphicBuilder;
	Observable observable;
	public GameFrame(String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observable) {
		this.setTitle(title);
		this.setSize(1240, 1240);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		//Pour une interface keyListener(auditeur de clé)
		addKeyListener(this);
		//Pour qu'une fenêtre intercepte les touches
		this.requestFocusInWindow();
		this.performer = performer;
		this.graphicBuilder = graphicBuilder;
		this.observable = observable;
	}
	
	public void keyPressed(KeyEvent keyEvent) {
		System.out.println(keyEvent.getKeyChar());
	}
	
	public void keyReleased(KeyEvent keyEvent) {
		System.out.println(keyEvent.getKeyChar());
	}
	
	public void keyTyped(KeyEvent keyEvent) {
		int touch = keyEvent.getKeyCode();
		if(touch == KeyEvent.VK_UP) {
			System.out.println("Haut = false");
		}
		if(touch == KeyEvent.VK_DOWN) {
			System.out.println("Bas");
		}
		if(touch == KeyEvent.VK_LEFT) {
			System.out.println("Gauche");
		}
		if(touch == KeyEvent.VK_RIGHT) {
			System.out.println("Droit");
		}
	}
}
