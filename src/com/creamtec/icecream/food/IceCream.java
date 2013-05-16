package com.creamtec.icecream.food;

public abstract class IceCream extends Food{
	
	private Taste taste;
	

	/**
	 * Default
	 * @param taste
	 * @param type
	 */
	public IceCream(Taste taste) {
		this.taste = taste;
	}



	@Override
	public String toString() {
		return taste + " " + this.getClass().getSimpleName();
	}
	
}