package jpu2016.dogfight.view;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.view.IViewSystem;
import java.lang.Runnable;
import java.util.Observable;

public class DogfightView {
	private EventPerformer EventPerformer;
	private GraphicsBuilder GraphicsBuilder;
	
	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable) {
		EventPerformer = new EventPerformer();
	}
	
	private void run() {
		
	}
	public void displayMessage(String message) {
		
	}
	public void closeAll() {
		
	}
}
