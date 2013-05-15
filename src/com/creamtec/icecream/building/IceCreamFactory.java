package com.creamtec.icecream.building;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;

import com.creamtec.icecream.food.IceCream;
import com.creamtec.icecream.food.IceCreamType;

public class IceCreamFactory {
	
	private Class<Enum<?>> types;
	private Enum tastes;
	
	
	
	public HashSet<IceCream> produceAllKnownIceCream(){
		List<IceCream> list = new ArrayList<IceCream>();
		
		for(IceCreamType type: Arrays.asList(types.getEnumConstants())){
			
		}
		
		return null;
	}
}
