package com.creamtec.icecream.building;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.creamtec.icecream.food.Food;
import com.creamtec.icecream.humans.Children;
import com.creamtec.icecream.rdo.NamesReference;

public class RandomKindergarten extends Kindergarten{

	/**
	 * Create instance of Kindergarten with random children
	 * @param size number of children
	 */
	public RandomKindergarten(Long size) {
		childrens = new ArrayList<Children>();
		NamesReference ref = new NamesReference();
		
		while(childrens.size() < size){
			childrens.add(new Children(ref.getNextName()));
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
			if(item == null){
				System.err.printf("There are no food for %s\n", child.getName());
			}else {
				child.offer(item);
			}		
		}
	}
	
	/**
	 * Purshase some food from store for every child
	 * @param store
	 */
	public void purshaseSomeFood(Store store, Class<? extends Food> clazz){
		int initSize = foodStorage.size();
		
		foodStorage.addAll(store.purshaseFood(clazz, (long) childrens.size()));
		
//		System.out.printf(">> Purshased  %s %ss from Store\n", foodStorage.size() - initSize, clazz.getSimpleName());
	}
	
	/**
	 * Get some food from storage
	 * @return food item
	 */
	private synchronized Food getSomeFood(){
		return ((Queue<Food>) foodStorage).poll();
	}
	
	
}
