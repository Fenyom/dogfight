package jpu2016.dogfight.controller;

public class UserOrder implements IUserOrder{
	
	// Creation of the variables player and order
		private int player;
		private Order order;              
		
	// Constructor linking a player and an order
		public UserOrder(int player, Order order) {
			this.player = player;
			this.order = order;
		}

	// Getters
		public int getPlayer() {
			return player;
		}


		public Order getOrder() {
			return order;
		}

		
}
