package com.creamtec.icecream.humans;

import com.creamtec.icecream.general.Action;


public class Children extends Person{

	public Children(String name) {
		super(name);
	}

	{
		knownActions.add(new Action("Lick"));
		knownActions.add(new Action("Suck"));
		knownActions.add(new Action("Bite"));
	}

}
