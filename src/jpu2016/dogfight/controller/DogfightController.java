package jpu2016.dogfight.controller;
import jpu2016.dogfight.view.*;
import jpu2016.dogfight.model.*;

public class DogfightController implements IOrderPerformer{

		private static int TIME_SLEEP = 30;
		private IViewSystem viewSystem;
		private IDogfightModel dogfightModel;
		
		public DogfightController(IDogfightModel dogfightModel) {
			this.dogfightModel = dogfightModel;
		}
		
		public void orderPerform(UserOrder userorder) {
			
		}
		
		public void play() {
			
		}

		public void setViewSystem(IViewSystem viewSystem) {
			this.viewSystem = viewSystem;
		}
		
		private void  lauchMissile (int player) {
			
		}
		
		private void gameLoop() {
			
		}
		
}
