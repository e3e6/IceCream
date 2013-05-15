package com.creamtec.icecream;

import com.creamtec.icecream.building.IceCreamFactory;
import com.creamtec.icecream.building.RandomKindergarten;
import com.creamtec.icecream.building.UnlimitedStore;
import com.creamtec.icecream.food.IceCream;

public class FeedThemAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Laboratory lab = new Laboratory();
		
		IceCreamFactory factory = new IceCreamFactory();
		
		UnlimitedStore store = new UnlimitedStore();
		
		RandomKindergarten kdg = new RandomKindergarten(10l);	
						   kdg.purshaseSomeFood(store, IceCream.class);
						   kdg.doSweetTooth();
	}

}
