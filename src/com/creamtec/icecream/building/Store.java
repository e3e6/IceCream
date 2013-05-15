package com.creamtec.icecream.building;

import java.util.Collection;

import com.creamtec.icecream.food.Food;

public interface Store {
	/**
	 * 
	 * @param clazz
	 * @param quantity
	 * @return
	 */
	public Collection<? extends Food> purshaseFood(Class<? extends Food> clazz, Long quantity);

}
