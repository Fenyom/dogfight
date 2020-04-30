package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;
import jpu2016.dogfight.gameframe.IEventPerformer;
import jpu2016.dogfight.controller.UserOrder;

public class EventPerformer {
	UserOrder UserOrder;

	public EventPerformer() {
		
	}
	
	public void eventPerform(KeyEvent keyCode) {
		
	}
	
	private UserOrder keyCodeToUserOrder(int keyCode) {
		return this.UserOrder;
	}
}
