package com.neotech.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {

		
		Map<String, String> mapExample = new LinkedHashMap();
		
		mapExample.put("Burak", "27");
		mapExample.put("Aslı", "25");
		mapExample.put("Ballito", "3");
		mapExample.put("Meroş", "47");
		
		
		System.out.println(mapExample);
		
		
		String[] names = {"Burak", "Aslı","Ballito"};
		
	System.out.println("-----------------");
	
		
		for(String m: names) {
			
			System.out.println(m);
		}
		
	}

}
