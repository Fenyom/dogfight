package jpu2016.dogfight.view;

import java.awt.event.KeyEvent;
import jpu2016.dogfight.gameframe.IEventPerformer;
import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;

public class EventPerformer {
	IOrderPerformer orderPerformer;

	public EventPerformer(IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}
	
	public void eventPerform(KeyEvent keyCode) {
		
	}
	
	private UserOrder keyCodeToUserOrder(int keyCode) {
		UserOrder userOrder = new UserOrder(keyCode, null);
		return userOrder;
	}
}
