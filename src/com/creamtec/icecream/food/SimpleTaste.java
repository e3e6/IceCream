package com.creamtec.icecream.food;

public class SimpleTaste extends Taste {

	private String name;
	
	public SimpleTaste(String tasteName) {
		this.name = tasteName; 
	}

	
	public String toString() {
		return name;
	};
}
