package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

import dogfight.view.GraphicsBuilder;

public class DogfightModel extends Observable implements IDogfightModel {
	
	protected Sky sky;
	protected ArrayList <IMobile> mobiles;

	public DogfightModel() {

		this.mobiles = new ArrayList <IMobile>();
	}

	@Override
	public IArea getIArea() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void buildArea(Dimension dimension) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMobile(IMobile Mobile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMobile(IMobile Mobile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<IMobile> getMobiles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IMobile getMobileByPlayer(int player) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMobilesHavesMoved() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGraphicsBuilder(GraphicsBuilder graphicsBuilder) {
		// TODO Auto-generated method stub
		
	}


}
