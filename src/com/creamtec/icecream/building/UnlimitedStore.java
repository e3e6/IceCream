package com.creamtec.icecream.building;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.creamtec.icecream.food.Food;

public class UnlimitedStore implements Store {
	
	private List<Food> knownFoods = new ArrayList();

	public void loadFood(List<? extends Food> someFood){
		
		
		for(Food o: someFood){
			knownFoods.add(o);
		}
		
//		System.out.printf(">> Loaded  %s items of Food into Store\n", knownFoods.size());
	}

	
	@Override
	public Collection<? extends Food> purshaseFood(Class<? extends Food> clazz,
			Long quantity) {
		
		List<Food> list = new ArrayList<Food>();
	
		while(list.size() < quantity){
			for(Food food: knownFoods){
				
				if(clazz.isInstance(food)){
					list.add(food);
				}
				
				if(list.size() >= quantity){
					break;
				}
			}
		}
//		System.out.printf(">> Sold  %s %ss from Store\n\n", list.size(), clazz.getSimpleName());
		return list;
	}
}
