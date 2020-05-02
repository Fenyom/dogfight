package jpu2016.dogfight.model;

import jpu2016.dogfight.view.*;
import java.util.ArrayList;
import java.util.Observable;
import java.awt.Dimension;

import jpu2016.dogfight.view.GraphicsBuilder;

public class DogfightModel extends Observable implements IDogfightModel {
	
	private Sky sky;
	private ArrayList <IMobile> mobiles;

	public DogfightModel() {

		this.mobiles = new ArrayList <IMobile>();
	}

	@Override
	public IArea getIArea() {
		// TODO Auto-generated method stub
		return(IArea) this.sky ;
	}

	public void buildArea(jpu2016.dogfight.model.Dimension dimension) {
		// TODO Auto-generated method stub
		this.sky = new Sky(dimension);
	}
	

	@Override
	public void addMobile(IMobile Mobile) {
		// TODO Auto-generated method stub
		this.getMobiles().add(Mobile);
	}

	@Override
	public void removeMobile(IMobile Mobile) {
		// TODO Auto-generated method stub
		this.getMobiles().remove(Mobile);
	}

	@Override
	public ArrayList<IMobile> getMobiles() {
		// TODO Auto-generated method stub
		return  this.mobiles;
	}

	@Override
	public IMobile getMobileByPlayer(int player) {
		// TODO Auto-generated method stub
		for (final IMobile mobile : this.getMobiles()) {
			if (mobile.isPlayer(player)) { return mobile; }
		}
		return null;
	}

	@Override
	public void setMobilesHavesMoved() {
		// TODO Auto-generated method stub
		
	}
	
	

}
