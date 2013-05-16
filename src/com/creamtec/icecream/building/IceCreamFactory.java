package com.creamtec.icecream.building;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.creamtec.icecream.food.IceCream;
import com.creamtec.icecream.food.SimpleTaste;
import com.creamtec.icecream.food.Taste;
import com.creamtec.icecream.food.sweets.Cone;
import com.creamtec.icecream.food.sweets.Cream;
import com.creamtec.icecream.food.sweets.Stick;
import com.creamtec.icecream.rdo.FruitsReference;

public class IceCreamFactory {
	
	/**
	 * 
	 * @return
	 */
	public List<IceCream> produceAllKnownIceCream(){
		List<IceCream> list = new ArrayList<IceCream>();

		
		for(Class<? extends IceCream> ice: getAllIceCreamTypes()){
			for(Taste taste: getSomeTaste()){
				//IceCream ice = new IceCream(taste, type);
				try {
					list.add(ice.getDeclaredConstructor(Taste.class).newInstance(taste));
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		return list;
	}
	
	/**
	 * 
	 * @return
	 */
	private List<Class<? extends IceCream>> getAllIceCreamTypes(){
		List<Class<? extends IceCream>>  list = new ArrayList<Class<? extends IceCream>>();
			list.add(Cone.class);
			list.add(Cream.class);
			list.add(Stick.class);
				
		return list;
	}
	
	/**
	 * 
	 * @return
	 */
	private List<Taste> getSomeTaste(){
		List<Taste> list = new ArrayList<Taste>();
		
		for(String fruitName: FruitsReference.FRUITS){
			list.add(new SimpleTaste(fruitName));
		}
			
		return list;
	}
}
