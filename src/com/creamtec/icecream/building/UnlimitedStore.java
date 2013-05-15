package com.creamtec.icecream.building;

import java.util.Collection;
import java.util.HashSet;

import com.creamtec.icecream.food.Food;

public class UnlimitedStore implements Store {
	
	private HashSet<Class<? extends Food>> knownFoods = new HashSet<Class<? extends Food>>();

	
	public void addNewItem(Food food){
		kn
	}
	
	@Override
	public Collection<? extends Food> purshaseFood(Class<? extends Food> clazz,
			Long quantity) {
		
		//
		HashSet<? extends Food> clazzInstances = new HashSet();
		
		return null;
	}

}
