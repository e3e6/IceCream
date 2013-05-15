package com.creamtec.icecream.building;

import java.util.LinkedList;
import java.util.Queue;

import com.creamtec.icecream.food.Food;
import com.creamtec.icecream.humans.Children;

public class RandomKindergarten extends Kindergarten{

	/**
	 * Create instance of Kindergarten with random children
	 * @param size number of children
	 */
	public RandomKindergarten(Long size) {
		while(childrens.size() < size){
			childrens.add(new Children());
		}

		foodStorage = new LinkedList<Food>(); //Unlimited storage
	}

	/**
	 * Let's have a breakfast
	 */
	public void doSweetTooth(){
		//give some food to childrens
		for(Children child: childrens){
			Food item = getSomeFood();
			if(item != null){
				child.offer(getSomeFood());
			}		
		}
	}
	
	/**
	 * Purshase some food from store for every child
	 * @param store
	 */
	public void purshaseSomeFood(Store store, Class<? extends Food> clazz){
		foodStorage.addAll(store.purshaseFood(clazz, (long) childrens.size()));
	}
	
	/**
	 * Get some food from storage
	 * @return food item
	 */
	private synchronized Food getSomeFood(){
		return ((Queue<Food>) foodStorage).poll();
	}
	
	
}
