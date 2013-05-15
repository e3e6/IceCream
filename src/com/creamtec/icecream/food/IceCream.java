package com.creamtec.icecream.food;

public class IceCream extends Food{
	
	private String taste;
	private String type;
	

	/**
	 * Default
	 * @param taste
	 * @param type
	 */
	public IceCream(String taste, String type) {
		super();
		this.taste = taste;
		this.type = type;
	}



	@Override
	public String toString() {
		return taste + " " + type;
	}
	
}