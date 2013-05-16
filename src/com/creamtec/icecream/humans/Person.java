package com.creamtec.icecream.humans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import com.creamtec.icecream.general.Action;
import com.creamtec.icecream.general.Item;

/**
 * Class represents a person
 * @author alex
 *
 */
public abstract class Person {
	protected String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected HashSet<Action> knownActions = new HashSet<Action>();
	
	
	/**
	 * Default constructor
	 * @param name
	 */
	public Person(String name) {
		super();
		this.name = name;
	}

	public void offer(Item someItem){
		doRandomAction(someItem);
	}
	
	private void doRandomAction(Item someItem){
		
		ArrayList<Action> list = new ArrayList<Action>();
				  list.addAll(knownActions);
				  
		Collections.shuffle(list);		  
		
		Iterator<Action> it = list.iterator();
		
		if(it.hasNext()){
			doAction(someItem, it.next());
		}
		
		
	}
	
	private void doAction(Item someItem, Action action){
		System.out.printf("%s %s %s \n", name, action.getName(), someItem.toString());
	}
}
