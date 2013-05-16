package com.creamtec.icecream.rdo;


public class NamesReference {
	
	private int lastIndex = 0;
	
	public final String[] names = {		
			"Jacob",
			"Mason", 	    
			"Ethan",    
			"Noah",      
			"William",
			"Liam",    
			"Jayden", 	    
			"Michael",	  
			"Alexander", 	
			"Aiden",
			"Sophia",
			"Emma",
			"Isabella",
			"Olivia",
			"Ava",
			"Emily",
			"Abigail",
			"Mia",
			"Madison",
			"Elizabeth"
	};

	
	
	public String getNextName(){
		if(lastIndex >= names.length){
			lastIndex = 0;
		}
		
		return names[lastIndex++];
	}
}
